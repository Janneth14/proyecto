/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Cantidad_Industrias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface Cantidad_IndustriasFacadeLocal {

    void create(Cantidad_Industrias cantidad_Industrias);

    void edit(Cantidad_Industrias cantidad_Industrias);

    void remove(Cantidad_Industrias cantidad_Industrias);

    Cantidad_Industrias find(Object id);

    List<Cantidad_Industrias> findAll();

    List<Cantidad_Industrias> findRange(int[] range);

    int count();
    
}
