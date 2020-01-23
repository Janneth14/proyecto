/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Materia_Prima;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface Materia_PrimaFacadeLocal {

    void create(Materia_Prima materia_Prima);

    void edit(Materia_Prima materia_Prima);

    void remove(Materia_Prima materia_Prima);

    Materia_Prima find(Object id);

    List<Materia_Prima> findAll();

    List<Materia_Prima> findRange(int[] range);

    int count();
    
}
