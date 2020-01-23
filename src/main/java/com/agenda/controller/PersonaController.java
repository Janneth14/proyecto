/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.PersonaFacadeLocal;
import com.agenda.model.Persona;
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
public class PersonaController implements Serializable{
    
    @EJB
    private PersonaFacadeLocal personaEJB;
    
    private Persona persona;
    
    @PostConstruct
    public void init(){
        persona=new Persona();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void Registrar(){
        try{
          personaEJB.create(persona);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"AVISO","REGISTRO CORRECTO"));
          //mensaje
            
        }catch(Exception e){
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,"AVISO","ERROR"));
        }
    }
    
}
