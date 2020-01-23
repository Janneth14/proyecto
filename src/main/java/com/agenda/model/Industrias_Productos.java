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

/**
 *
 * @author jonat
 */
@Entity
@Table(name="industrias_productos")
public class Industrias_Productos implements Serializable{
    
   @Id
   private int id_industrias;
   @Column(name="id_diie")
   private double id_diie;
   @Column(name="ciiu3")
   private double ciiu3;
   @Column(name="des_ciiu3")
   private String des_ciiu3;
   @Column(name="cpc")
   private double cpc;
   @Column(name="des_cpc")
   private String des_cpc;
   @Column(name="valor_total")
   private double valor_total;

    public int getId_industrias() {
        return id_industrias;
    }

    public void setId_industrias(int id_industrias) {
        this.id_industrias = id_industrias;
    }

    public double getId_diie() {
        return id_diie;
    }

    public void setId_diie(double id_diie) {
        this.id_diie = id_diie;
    }

    public double getCiiu3() {
        return ciiu3;
    }

    public void setCiiu3(double ciiu3) {
        this.ciiu3 = ciiu3;
    }

    public String getDes_ciiu3() {
        return des_ciiu3;
    }

    public void setDes_ciiu3(String des_ciiu3) {
        this.des_ciiu3 = des_ciiu3;
    }

    public double getCpc() {
        return cpc;
    }

    public void setCpc(double cpc) {
        this.cpc = cpc;
    }

    public String getDes_cpc() {
        return des_cpc;
    }

    public void setDes_cpc(String des_cpc) {
        this.des_cpc = des_cpc;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id_industrias;
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
        final Industrias_Productos other = (Industrias_Productos) obj;
        if (this.id_industrias != other.id_industrias) {
            return false;
        }
        return true;
    }
   
   
   
   
    
}
