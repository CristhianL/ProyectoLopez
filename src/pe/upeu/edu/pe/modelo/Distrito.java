/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.pe.modelo;

/**
 *
 * @author alum.fial7
 */
public class Distrito {
    private int idd;
    private int idr;
    private String disc;
    private String estado;

    public Distrito() {
    }

    public Distrito(int idd, int idr, String disc, String estado) {
        this.idd = idd;
        this.idr = idr;
        this.disc = disc;
        this.estado = estado;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
