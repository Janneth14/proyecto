/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jonat
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {

    @PersistenceContext(unitName = "agendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    @Override
    public Persona iniciarSesion(Persona pe){
        Persona persona = null;
        String consulta;
        try{
            consulta="FROM Persona p WHERE p.usuario =?1 and p.clave=?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1,pe.getUsuario());
            query.setParameter(2,pe.getClave());
            List<Persona> lista =query.getResultList();
            
            if(!lista.isEmpty()){
                persona=lista.get(0);
            }
        
        }catch(Exception e){
            throw e;
        }
        
        return persona;
    }
}
