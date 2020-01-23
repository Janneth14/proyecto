/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.controller;

import com.agenda.ejb.AuditoriaFacadeLocal;
import com.agenda.model.Auditoria;
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
public class AuditoriaController implements Serializable{
    
    
     @EJB
     private AuditoriaFacadeLocal AuditoriaEJB;
     private List<Auditoria> auditoria;

    public AuditoriaFacadeLocal getAuditoriaEJB() {
        return AuditoriaEJB;
    }

    public void setAuditoriaEJB(AuditoriaFacadeLocal AuditoriaEJB) {
        this.AuditoriaEJB = AuditoriaEJB;
    }

    public List<Auditoria> getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(List<Auditoria> auditoria) {
        this.auditoria = auditoria;
    }
     
     
     
     
     @PostConstruct
     public void init(){
        auditoria=AuditoriaEJB.findAll();
     } 
     
     
    
}
