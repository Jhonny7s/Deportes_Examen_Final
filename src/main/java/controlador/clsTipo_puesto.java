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
public class clsTipo_puesto {
    int iId_tipo_puesto;
    String sNombre_puesto;
    double dSalario;

    public clsTipo_puesto() {
    }

    public clsTipo_puesto(int iId_tipo_puesto, String sNombre_puesto, double dSalario) {
        this.iId_tipo_puesto = iId_tipo_puesto;
        this.sNombre_puesto = sNombre_puesto;
        this.dSalario = dSalario;
    }

    public int getiId_tipo_puesto() {
        return iId_tipo_puesto;
    }

    public void setiId_tipo_puesto(int iId_tipo_puesto) {
        this.iId_tipo_puesto = iId_tipo_puesto;
    }

    public String getsNombre_puesto() {
        return sNombre_puesto;
    }

    public void setsNombre_puesto(String sNombre_puesto) {
        this.sNombre_puesto = sNombre_puesto;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }

    @Override
    public String toString() {
        return "clsTipo_puesto{" + "iId_tipo_puesto=" + iId_tipo_puesto + ", sNombre_puesto=" + sNombre_puesto + ", dSalario=" + dSalario + '}';
    }
    
}
