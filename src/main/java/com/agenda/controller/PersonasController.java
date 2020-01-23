/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.PersonasFacadeLocal;
import com.agenda.model.Personas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author jonat
 */

@Named
@ViewScoped
public class PersonasController implements Serializable{
    
    @EJB
    private PersonasFacadeLocal personaEJB;
    
    private Personas personas;
    
    @PostConstruct
    public void init(){
        personas=new Personas();
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

   
    
    public void Registrar_P(){
        try{
            personaEJB.create(personas);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"AVISO","REGISTRO CORRECTO"));
          //mensaje
            
        }catch(Exception e){
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,"AVISO","ERROR"));
        }
    }
    
}
