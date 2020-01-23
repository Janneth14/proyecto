
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

@Named
@ViewScoped
public class IndexController implements Serializable{
    @EJB
    private PersonasFacadeLocal EJBPersona;
    
    private Personas persona;
    
    @PostConstruct
    public void init(){
        persona=new Personas();
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    
    public String inciarSesion(){
        Personas pers;
        String redireccion=null;
        try{
            pers=EJBPersona.iniciarSesion(persona);
            
            if(pers != null){
                //Almacenar en la sesion de JSF
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", pers);
                redireccion="/protegido/principal?faces-redirect=true";
            }else{
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN,"AVISO","CREDENCIALES NO ENCONTRADAS"));
            }
            
        }catch(Exception e){
             FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,"AVISO","CREDENCIALES NO ENCONTRADAS"));
        }
        
        return redireccion;
    }
    
}
