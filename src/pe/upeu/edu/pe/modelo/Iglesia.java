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
public class Iglesia {
    private int idi;
    private int idd;
    private int idti;
    private String nomiglesia;
    private int cuenta;

    public Iglesia() {
    }

    public Iglesia(int idd, int idti, String nomiglesia, int cuenta) {
        this.idd = idd;
        this.idti = idti;
        this.nomiglesia = nomiglesia;
        this.cuenta = cuenta;
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNomiglesia() {
        return nomiglesia;
    }

    public void setNomiglesia(String nomiglesia) {
        this.nomiglesia = nomiglesia;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
