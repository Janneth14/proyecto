/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.Industrias_ProductosFacadeLocal;
import com.agenda.model.Industrias_Productos;
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
public class Industrias_ProductosController {
    @EJB
     private Industrias_ProductosFacadeLocal indProEJB;
     private List<Industrias_Productos> indPro;

    public Industrias_ProductosFacadeLocal getIndProEJB() {
        return indProEJB;
    }

    public void setIndProEJB(Industrias_ProductosFacadeLocal indProEJB) {
        this.indProEJB = indProEJB;
    }

    public List<Industrias_Productos> getIndPro() {
        return indPro;
    }

    public void setIndPro(List<Industrias_Productos> indPro) {
        this.indPro = indPro;
    }
     
     
     
      
    @PostConstruct
    public void init(){
        indPro=indProEJB.findAll();
    }
     
     
     
}
