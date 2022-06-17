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
public class clsTipo_jugador {
    int iId_tipo_jugador;
    String sNombre_posicion;

    public clsTipo_jugador() {
    }

    public clsTipo_jugador(int iId_tipo_jugador, String sNombre_posicion) {
        this.iId_tipo_jugador = iId_tipo_jugador;
        this.sNombre_posicion = sNombre_posicion;
    }

    public int getiId_tipo_jugador() {
        return iId_tipo_jugador;
    }

    public void setiId_tipo_jugador(int iId_tipo_jugador) {
        this.iId_tipo_jugador = iId_tipo_jugador;
    }

    public String getsNombre_posicion() {
        return sNombre_posicion;
    }

    public void setsNombre_posicion(String sNombre_posicion) {
        this.sNombre_posicion = sNombre_posicion;
    }

    @Override
    public String toString() {
        return "clsTipo_jugador{" + "iId_tipo_jugador=" + iId_tipo_jugador + ", sNombre_posicion=" + sNombre_posicion + '}';
    }

}
