/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Industrias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface IndustriasFacadeLocal {

    void create(Industrias industrias);

    void edit(Industrias industrias);

    void remove(Industrias industrias);

    Industrias find(Object id);

    List<Industrias> findAll();

    List<Industrias> findRange(int[] range);

    int count();
    
}
