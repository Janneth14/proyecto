/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Persona;
import com.agenda.model.Personas;
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
public class PersonasFacade extends AbstractFacade<Personas> implements PersonasFacadeLocal {

    @PersistenceContext(unitName = "agendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonasFacade() {
        super(Personas.class);
    }
    
    @Override
    public Personas iniciarSesion(Personas pe){
        Personas personas = null;
        String consulta;
        try{
            consulta="FROM Personas p WHERE p.correo =?1 and p.contrasenia=?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1,pe.getCorreo());
            query.setParameter(2,pe.getContrasenia());
            List<Personas> lista =query.getResultList();
            
            if(!lista.isEmpty()){
                personas=lista.get(0);
            }
        
        }catch(Exception e){
            throw e;
        }
        
        return personas;
    }
    
}
