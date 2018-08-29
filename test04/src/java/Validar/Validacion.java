/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validar;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luis
 * @version Emmanuel
 */
public class Validacion extends Conexion {

    public Validacion() {

    }

    public boolean iniciarSesion(String Email, String Contrasena) {
        PreparedStatement Validacion = null;
        ResultSet Result = null;

        String SentenciaSQL = "select * from Usuario where Email = ? and Password = ?";
        try {
            Validacion = getConexion().prepareStatement(SentenciaSQL);
            Validacion.setString(1, Email);
            Validacion.setString(2, Contrasena);
            Result = Validacion.executeQuery();

            if (Result.absolute(1)) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar el usuario" + e);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (Validacion != null) {
                    Validacion.close();
                }
                if (Result != null) {
                    Result.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean registro(String Username, String Contrasena, String Email, String Rol) {
        PreparedStatement Validacion = null;

        try {

            String SentenciaSQL = "insert into Usuario values(?,?,?,?)";

            Validacion = getConexion().prepareStatement(SentenciaSQL);
            Validacion.setString(1, Username);
            Validacion.setString(2, Contrasena);
            Validacion.setString(3, Email);
            Validacion.setString(4, Rol);

            if (Validacion.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (Validacion != null) {
                    Validacion.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Validacion vali = new Validacion();
        if (vali.registro("Zoruark", "12345", "enmanuel@gmail.com", "consulta")) {
            System.out.println("hola");
        }
    }

}
