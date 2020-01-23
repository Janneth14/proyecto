/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.MenuFacadeLocal;
import com.agenda.model.Menu;
import com.agenda.model.Personas;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author jonat
 */

@Named
@SessionScoped
public class MenuController implements Serializable{
    
    @EJB
    private MenuFacadeLocal EJBMenu;
    private List<Menu> lista;
    private MenuModel model;
    
    
    @PostConstruct
    public void init(){
        this.listaMenus();
        model=new DefaultMenuModel();
        this.establecerpermisos();
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }
    
    
    public void listaMenus(){
        
        try{
          
           lista=EJBMenu.findAll();
    
        }catch(Exception e){
            //mensaje jsf
        }
    }
    
    
    public void establecerpermisos(){
        Personas per=(Personas) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        //System.out.println("session perfil"+per.getPerfil());
        for(Menu m : lista){
            //System.out.println("session perfil m"+m.getPerfil());
            if(m.getPerfil().equals(per.getPerfil())){
                DefaultMenuItem item = new DefaultMenuItem(m.getDescripcion());
                item.setUrl(m.getUrl());
                model.addElement(item);
        }
    }
}
    
    
    public void CerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

}