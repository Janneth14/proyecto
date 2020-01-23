/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.Cantidad_IndustriasFacadeLocal;
import com.agenda.model.Cantidad_Industrias;
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
public class Cantidad_Industrias_Controller implements Serializable {
     @EJB
     private Cantidad_IndustriasFacadeLocal cantindEJB;
     private List<Cantidad_Industrias> cantind;

    public Cantidad_IndustriasFacadeLocal getCantindEJB() {
        return cantindEJB;
    }

    public void setCantindEJB(Cantidad_IndustriasFacadeLocal cantindEJB) {
        this.cantindEJB = cantindEJB;
    }

    public List<Cantidad_Industrias> getCantind() {
        return cantind;
    }

    public void setCantind(List<Cantidad_Industrias> cantind) {
        this.cantind = cantind;
    }
     
    
    @PostConstruct
    public void init(){
        cantind=cantindEJB.findAll();
    }
     
     
     
     
}
