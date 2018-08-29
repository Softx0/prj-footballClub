/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Validar.Validacion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
@Named(value = "usuarioManagedBean")
@SessionScoped
public class UsuarioManagedBean implements Serializable {

    /**
     * Creates a new instance of UsuarioManagedBean
     */
    public UsuarioManagedBean() {
    }

    String email;
    String password;
    String rol;
    String username;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String inicioSesion() {

        Validacion vali = new Validacion();

        if (vali.iniciarSesion(email, password)) {
            return "index";

        } else {
            return "iniciarSesion";

        }
    }

    public String registro() {

        Validacion vali = new Validacion();

        if (vali.registro(username, password, email, rol)) {

            return "index";

        } else {

            return "registro";

        }
    }

}
