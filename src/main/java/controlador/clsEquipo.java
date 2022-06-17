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
public class clsEquipo {
    int iId_equipo;
    String sNombre_equipo;
    int iId_entrenador;
    int iId_tipo_deporte_fk;

    public clsEquipo() {
    }

    public clsEquipo(int iId_equipo, String sNombre_equipo, int iId_entrenador, int iId_tipo_deporte_fk) {
        this.iId_equipo = iId_equipo;
        this.sNombre_equipo = sNombre_equipo;
        this.iId_entrenador = iId_entrenador;
        this.iId_tipo_deporte_fk = iId_tipo_deporte_fk;
    }

    public int getiId_equipo() {
        return iId_equipo;
    }

    public void setiId_equipo(int iId_equipo) {
        this.iId_equipo = iId_equipo;
    }

    public String getsNombre_equipo() {
        return sNombre_equipo;
    }

    public void setsNombre_equipo(String sNombre_equipo) {
        this.sNombre_equipo = sNombre_equipo;
    }

    public int getiId_entrenador() {
        return iId_entrenador;
    }

    public void setiId_entrenador(int iId_entrenador) {
        this.iId_entrenador = iId_entrenador;
    }

    public int getiId_tipo_deporte_fk() {
        return iId_tipo_deporte_fk;
    }

    public void setiId_tipo_deporte_fk(int iId_tipo_deporte_fk) {
        this.iId_tipo_deporte_fk = iId_tipo_deporte_fk;
    }

    @Override
    public String toString() {
        return "clsEquipo{" + "iId_equipo=" + iId_equipo + ", sNombre_equipo=" + sNombre_equipo + ", iId_entrenador=" + iId_entrenador + ", iId_tipo_deporte_fk=" + iId_tipo_deporte_fk + '}';
    }

    
}
