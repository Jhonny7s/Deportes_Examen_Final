/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsEntrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoEntrenador {

    private static final String SQL_SELECT = "SELECT Id_entrenador, Nombre1, Nombre2, Apellido1, Apellido2, Fecha_nacimiento, Id_usuario_fk, Foto_Entrenador FROM tbl_entrenador";
    private static final String SQL_INSERT = "INSERT INTO tbl_entrenador(Id_entrenador, Nombre1, Nombre2, Apellido1, Apellido2, Fecha_nacimiento, Id_usuario_fk, Foto_Entrenador) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_entrenador SET Id_entrenador=?, Nombre1=?, Nombre2=?, Apellido1=?, Apellido2=?, Fecha_nacimiento=?, Id_usuario_fk=?, Foto_Entrenador=? WHERE aplid = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_entrenador WHERE aplid=?";
    private static final String SQL_QUERY = "SELECT Id_entrenador, Nombre1, Nombre2, Apellido1, Apellido2, Fecha_nacimiento, Id_usuario_fk, Foto_Entrenador FROM tbl_entrenador WHERE aplid = ?";

    public List<clsEntrenador> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsEntrenador aplicacion = null;
        List<clsEntrenador> aplicaciones = new ArrayList<clsEntrenador>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_entrenador = rs.getInt("Id_entrenador");
                int Nombre1 = rs.getInt("Nombre1");
                String Nombre2 = rs.getString("Nombre2");
                String Apellido1 = rs.getString("Apellido1");
                String Apellido2 = rs.getString("Apellido2");
                String Fecha_nacimiento = rs.getString("Fecha_nacimiento");
                String Id_usuario_fk = rs.getString("Id_usuario_fk");
                
                aplicacion = new clsEntrenador();
                aplicacion.setId_entrenador(Id_entrenador);
                aplicacion.setiNombre1(Nombre1);
                aplicacion.setsNombre2(Nombre2);
                aplicacion.setsApellido1(Apellido1);
                aplicacion.setsApellido2(Apellido2);
                aplicacion.setsFecha_nacimiento(Fecha_nacimiento);
                aplicacion.setsId_usuario_fk(Id_usuario_fk);

                
                
                aplicaciones.add(aplicacion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return aplicaciones;
    }

    public int insert(clsEntrenador Entrenador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, Entrenador.getId_entrenador());
            stmt.setInt(2, Entrenador.getiNombre1());
             stmt.setString(3, Entrenador.getsNombre2());
            stmt.setString(4, Entrenador.getsApellido1());
             stmt.setString(5, Entrenador.getsApellido2());
            stmt.setString(6, Entrenador.getsFecha_nacimiento());
            stmt.setString(7, Entrenador.getsId_usuario_fk());


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int update(clsEntrenador Entrenador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
             
            stmt.setInt(1, Entrenador.getId_entrenador());
            stmt.setInt(2, Entrenador.getiNombre1());
             stmt.setString(3, Entrenador.getsNombre2());
            stmt.setString(4, Entrenador.getsApellido1());
             stmt.setString(5, Entrenador.getsApellido2());
            stmt.setString(6, Entrenador.getsFecha_nacimiento());
            stmt.setString(7, Entrenador.getsId_usuario_fk());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsEntrenador Entrenador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setString(1, Entrenador.getsId_usuario_fk());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public clsEntrenador query(clsEntrenador Entrenador) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
             stmt.setString(1, Entrenador.getsId_usuario_fk());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_entrenador = rs.getInt("Id_entrenador");
                int Nombre1 = rs.getInt("Nombre1");
                String Nombre2 = rs.getString("Nombre2");
                String Apellido1 = rs.getString("Apellido1");
                String Apellido2 = rs.getString("Apellido2");
                String Fecha_nacimiento = rs.getString("Fecha_nacimiento");
                String Id_usuario_fk = rs.getString("Id_usuario_fk");
                
                Entrenador = new clsEntrenador();
                Entrenador.setId_entrenador(Id_entrenador);
                Entrenador.setiNombre1(Nombre1);
                Entrenador.setsNombre2(Nombre2);
                Entrenador.setsApellido1(Apellido1);
                Entrenador.setsApellido2(Apellido2);
                Entrenador.setsFecha_nacimiento(Fecha_nacimiento);
                Entrenador.setsId_usuario_fk(Id_usuario_fk);

                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return Entrenador;
    }
        
}
