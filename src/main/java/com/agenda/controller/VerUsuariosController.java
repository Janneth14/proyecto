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
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named 
@ViewScoped
public class VerUsuariosController implements Serializable{
    
    
    @EJB 
    private PersonasFacadeLocal personasEJB;
    private List<Personas> personas;

    public PersonasFacadeLocal getPersonasEJB() {
        return personasEJB;
    }

    public void setPersonasEJB(PersonasFacadeLocal personasEJB) {
        this.personasEJB = personasEJB;
    }

    public List<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Personas> personas) {
        this.personas = personas;
    }
    
    
    
    @PostConstruct
    public void init(){
        personas=personasEJB.findAll();
    }
    
    
    
}
