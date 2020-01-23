/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.Materia_PrimaFacadeLocal;
import com.agenda.model.Materia_Prima;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author jonat
 */
@Named 
@ViewScoped
public class VerDatosO implements Serializable{
    
    @EJB
    private Materia_PrimaFacadeLocal materiaEJB;
    private List<Materia_Prima> materia;

    public Materia_PrimaFacadeLocal getMateriaEJB() {
        return materiaEJB;
    }

    public void setMateriaEJB(Materia_PrimaFacadeLocal materiaEJB) {
        this.materiaEJB = materiaEJB;
    }

    public List<Materia_Prima> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia_Prima> materia) {
        this.materia = materia;
    }
    
  
    @PostConstruct
    public void init(){
        materia=materiaEJB.findAll();
    }
    
    
}
