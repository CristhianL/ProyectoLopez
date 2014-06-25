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
public class Persona {
    private int idp;
    private int idd;
    private String nombres;
    private String dir;
    private String tel;
    private String est;

    public Persona() {
    }

    public Persona(int idd, String nombres, String dir, String tel) {
        this.idd = idd;
        this.nombres = nombres;
        this.dir = dir;
        this.tel = tel;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }
            
    
}
