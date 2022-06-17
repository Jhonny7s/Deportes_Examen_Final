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
public class clsEntrenador {
    int Id_entrenador;
    int iNombre1;
    String sNombre2;
    String sApellido1;
    String sApellido2;
    String sFecha_nacimiento;
    String sId_usuario_fk;
    Long lFoto_Entrenador;

    public clsEntrenador() {
    }

    public clsEntrenador(int Id_entrenador, int iNombre1, String sNombre2, String sApellido1, String sApellido2, String sFecha_nacimiento, String sId_usuario_fk, Long lFoto_Entrenador) {
        this.Id_entrenador = Id_entrenador;
        this.iNombre1 = iNombre1;
        this.sNombre2 = sNombre2;
        this.sApellido1 = sApellido1;
        this.sApellido2 = sApellido2;
        this.sFecha_nacimiento = sFecha_nacimiento;
        this.sId_usuario_fk = sId_usuario_fk;
        this.lFoto_Entrenador = lFoto_Entrenador;
    }

    public int getId_entrenador() {
        return Id_entrenador;
    }

    public void setId_entrenador(int Id_entrenador) {
        this.Id_entrenador = Id_entrenador;
    }

    public int getiNombre1() {
        return iNombre1;
    }

    public void setiNombre1(int iNombre1) {
        this.iNombre1 = iNombre1;
    }

    public String getsNombre2() {
        return sNombre2;
    }

    public void setsNombre2(String sNombre2) {
        this.sNombre2 = sNombre2;
    }

    public String getsApellido1() {
        return sApellido1;
    }

    public void setsApellido1(String sApellido1) {
        this.sApellido1 = sApellido1;
    }

    public String getsApellido2() {
        return sApellido2;
    }

    public void setsApellido2(String sApellido2) {
        this.sApellido2 = sApellido2;
    }

    public String getsFecha_nacimiento() {
        return sFecha_nacimiento;
    }

    public void setsFecha_nacimiento(String sFecha_nacimiento) {
        this.sFecha_nacimiento = sFecha_nacimiento;
    }

    public String getsId_usuario_fk() {
        return sId_usuario_fk;
    }

    public void setsId_usuario_fk(String sId_usuario_fk) {
        this.sId_usuario_fk = sId_usuario_fk;
    }

    public Long getlFoto_Entrenador() {
        return lFoto_Entrenador;
    }

    public void setlFoto_Entrenador(Long lFoto_Entrenador) {
        this.lFoto_Entrenador = lFoto_Entrenador;
    }

    @Override
    public String toString() {
        return "clsEntrenador{" + "Id_entrenador=" + Id_entrenador + ", iNombre1=" + iNombre1 + ", sNombre2=" + sNombre2 + ", sApellido1=" + sApellido1 + ", sApellido2=" + sApellido2 + ", sFecha_nacimiento=" + sFecha_nacimiento + ", sId_usuario_fk=" + sId_usuario_fk + ", lFoto_Entrenador=" + lFoto_Entrenador + '}';
    }


}
