/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.ejb;

import com.agenda.model.Industrias_Productos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface Industrias_ProductosFacadeLocal {

    void create(Industrias_Productos industrias_Productos);

    void edit(Industrias_Productos industrias_Productos);

    void remove(Industrias_Productos industrias_Productos);

    Industrias_Productos find(Object id);

    List<Industrias_Productos> findAll();

    List<Industrias_Productos> findRange(int[] range);

    int count();
    
}
