/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jonat
 */
@Entity
@Table(name="industrias")
public class Industrias implements Serializable{
    
    @Id
    private String des_cpc;
    @Column(name="precio_total")
    private double precio_total;

    public String getDes_cpc() {
        return des_cpc;
    }

    public void setDes_cpc(String des_cpc) {
        this.des_cpc = des_cpc;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.des_cpc);
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
        final Industrias other = (Industrias) obj;
        if (!Objects.equals(this.des_cpc, other.des_cpc)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
