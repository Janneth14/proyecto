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
@Table(name="materia_prima")
public class Materia_Prima implements Serializable{
    
    @Id
    private double id_diie;
    @Column(name="ciiu3")
    private double ciiu3;
    @Column(name="des_ciiu3")
    private String des_ciiu3;
    @Column(name="cpc")
    private double cpc;
    @Column(name="des_cpc")
    private String des_cpc;
    @Column(name="unidad")
    private double unidad;
    @Column(name="des_unidad")
    private String des_unidad;
    @Column(name="cantidad_n")
    private double cantidad_n;
    @Column(name="valor_n")
    private double valor_n;
    @Column(name="cantidad_e")
    private double cantidad_e;
    @Column(name="valor_e")
    private double valor_e;
    @Column(name="cuenta3")
    private double cuenta3;
    @Column(name="wgrumanu")
    private String wgrumanu ;

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

    public double getUnidad() {
        return unidad;
    }

    public void setUnidad(double unidad) {
        this.unidad = unidad;
    }

    public String getDes_unidad() {
        return des_unidad;
    }

    public void setDes_unidad(String des_unidad) {
        this.des_unidad = des_unidad;
    }

    public double getCantidad_n() {
        return cantidad_n;
    }

    public void setCantidad_n(double cantidad_n) {
        this.cantidad_n = cantidad_n;
    }

    public double getValor_n() {
        return valor_n;
    }

    public void setValor_n(double valor_n) {
        this.valor_n = valor_n;
    }

    public double getCantidad_e() {
        return cantidad_e;
    }

    public void setCantidad_e(double cantidad_e) {
        this.cantidad_e = cantidad_e;
    }

    public double getValor_e() {
        return valor_e;
    }

    public void setValor_e(double valor_e) {
        this.valor_e = valor_e;
    }

    public double getCuenta3() {
        return cuenta3;
    }

    public void setCuenta3(double cuenta3) {
        this.cuenta3 = cuenta3;
    }

    public String getWgrumanu() {
        return wgrumanu;
    }

    public void setWgrumanu(String wgrumanu) {
        this.wgrumanu = wgrumanu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.id_diie) ^ (Double.doubleToLongBits(this.id_diie) >>> 32));
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
        final Materia_Prima other = (Materia_Prima) obj;
        if (Double.doubleToLongBits(this.id_diie) != Double.doubleToLongBits(other.id_diie)) {
            return false;
        }
        return true;
    }

   
    
    
}
