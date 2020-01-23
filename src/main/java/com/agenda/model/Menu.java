/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pagina")
public class Menu implements Serializable{
    
    @Id
    private int id_pagina;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="url")
    private String url;
    
    @Column(name="perfil")
    private String perfil;

    public int getId_pagina() {
        return id_pagina;
    }

    public void setId_pagina(int id_pagina) {
        this.id_pagina = id_pagina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (this.id_pagina != other.id_pagina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Menu{" + "id_pagina=" + id_pagina + '}';
    }
    
    
    
    
    
}
