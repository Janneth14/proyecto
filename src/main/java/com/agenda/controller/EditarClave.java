/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.PersonasFacadeLocal;
import com.agenda.model.Personas;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class EditarClave implements Serializable{
    
    @EJB
    private PersonasFacadeLocal personasEJB;
   
    private Personas personas;
    private List<Personas> persona;
    
  

    public PersonasFacadeLocal getPersonasEJB() {
        return personasEJB;
    }

    public void setPersonasEJB(PersonasFacadeLocal personasEJB) {
        this.personasEJB = personasEJB;
    }
    
  
    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public List<Personas> getPersona() {
        return persona;
    }

    public void setPersona(List<Personas> persona) {
        this.persona = persona;
    }
    
    @PostConstruct
    public void init(){
        persona=personasEJB.findAll();
    }
    
    
     public void registrarcambio(){
        Personas per=(Personas) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
       
        personas.setCodigo(per.getCodigo());
        //personas=clavepersona;
        //personasEJB.findAll();
         persona=(List<Personas>) personasEJB.find(per.getCodigo());
    }
    
}
