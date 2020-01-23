/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Materia_Prima;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonat
 */
@Stateless
public class Materia_PrimaFacade extends AbstractFacade<Materia_Prima> implements Materia_PrimaFacadeLocal {

    @PersistenceContext(unitName = "agendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Materia_PrimaFacade() {
        super(Materia_Prima.class);
    }
    
}
