/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Cantidad_Industrias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonat
 */
@Stateless
public class Cantidad_IndustriasFacade extends AbstractFacade<Cantidad_Industrias> implements Cantidad_IndustriasFacadeLocal {

    @PersistenceContext(unitName = "agendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Cantidad_IndustriasFacade() {
        super(Cantidad_Industrias.class);
    }
    
}
