/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author visitante
 */
public class clsPais {
    int iId_pais;
    String sNombre_pais;

    public clsPais() {
    }

    public clsPais(int iId_pais, String sNombre_pais) {
        this.iId_pais = iId_pais;
        this.sNombre_pais = sNombre_pais;
    }

    public int getiId_pais() {
        return iId_pais;
    }

    public void setiId_pais(int iId_pais) {
        this.iId_pais = iId_pais;
    }

    public String getsNombre_pais() {
        return sNombre_pais;
    }

    public void setsNombre_pais(String sNombre_pais) {
        this.sNombre_pais = sNombre_pais;
    }

    @Override
    public String toString() {
        return "clsPais{" + "iId_pais=" + iId_pais + ", sNombre_pais=" + sNombre_pais + '}';
    }
   
    
}
