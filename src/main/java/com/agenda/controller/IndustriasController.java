/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.IndustriasFacadeLocal;
import com.agenda.model.Industrias;
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
public class IndustriasController implements Serializable{
    
    @EJB
    private IndustriasFacadeLocal industriasEJB;
    private List<Industrias> industrias;

    public IndustriasFacadeLocal getIndustriasEJB() {
        return industriasEJB;
    }

    public List<Industrias> getIndustrias() {
        return industrias;
    }
    
    
    @PostConstruct
    public void init(){
        industrias=industriasEJB.findAll();
    }
    
    
}
