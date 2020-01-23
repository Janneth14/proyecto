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
@Table(name="cantidad_industrias")
public class Cantidad_Industrias implements Serializable{
    
    @Id
    private int id_cantidad;
    @Column(name="valor_total_n")
    private double valor_total_n;
    @Column(name="id_diie")
    private double id_diie;
    @Column(name="valor_total_e")
    private double valor_total_e;
    @Column(name="ciiu3")
    private double ciiu3;
    @Column(name="des_ciiu3")
    private String des_ciiu3;
    @Column(name="cpc")
    private double cpc;
    @Column(name="des_cpc")
    private String des_cpc;

    public int getId_cantidad() {
        return id_cantidad;
    }

    public void setId_cantidad(int id_cantidad) {
        this.id_cantidad = id_cantidad;
    }

    public double getValor_total_n() {
        return valor_total_n;
    }

    public void setValor_total_n(double valor_total_n) {
        this.valor_total_n = valor_total_n;
    }

    public double getId_diie() {
        return id_diie;
    }

    public void setId_diie(double id_diie) {
        this.id_diie = id_diie;
    }

    public double getValor_total_e() {
        return valor_total_e;
    }

    public void setValor_total_e(double valor_total_e) {
        this.valor_total_e = valor_total_e;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id_cantidad;
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
        final Cantidad_Industrias other = (Cantidad_Industrias) obj;
        if (this.id_cantidad != other.id_cantidad) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
