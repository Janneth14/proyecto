package com.agenda.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package com.agenda.model;

/**
 *
 * @author jonat
 */

@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
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
    @Column(name="cantidad_ventas_n")
    private double cantidad_ventas_n;
    @Column(name="valor_ventas_n")
    private double valor_ventas_n;
    @Column(name="cantidad_ventas_e")
    private double cantidad_ventas_e;
    @Column(name="valor_ventas_e")
    private double valor_ventas_e;
    @Column(name="cant_terceros")
    private double cant_terceros;
    @Column(name="wgrumanu")
    private String wgrumanu;

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

    public double getCantidad_ventas_n() {
        return cantidad_ventas_n;
    }

    public void setCantidad_ventas_n(double cantidad_ventas_n) {
        this.cantidad_ventas_n = cantidad_ventas_n;
    }

    public double getValor_ventas_n() {
        return valor_ventas_n;
    }

    public void setValor_ventas_n(double valor_ventas_n) {
        this.valor_ventas_n = valor_ventas_n;
    }

    public double getCantidad_ventas_e() {
        return cantidad_ventas_e;
    }

    public void setCantidad_ventas_e(double cantidad_ventas_e) {
        this.cantidad_ventas_e = cantidad_ventas_e;
    }

    public double getValor_ventas_e() {
        return valor_ventas_e;
    }

    public void setValor_ventas_e(double valor_ventas_e) {
        this.valor_ventas_e = valor_ventas_e;
    }

    public double getCant_terceros() {
        return cant_terceros;
    }

    public void setCant_terceros(double cant_terceros) {
        this.cant_terceros = cant_terceros;
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
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.id_diie) ^ (Double.doubleToLongBits(this.id_diie) >>> 32));
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
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.id_diie) != Double.doubleToLongBits(other.id_diie)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
