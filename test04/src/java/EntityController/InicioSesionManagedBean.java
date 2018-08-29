/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityController;

import Validar.Validacion;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author DELL
 */
@Named(value = "inicioSesionManagedBean")
@RequestScoped
public class InicioSesionManagedBean {

    String email;
    String password;

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

    /**
     * Creates a new instance of InicioSesionManagedBean
     */
    public InicioSesionManagedBean() {

    }

    public String inicioSesion() {

        Validacion vali = new Validacion();

        if (vali.iniciarSesion(email, password)) {
            
            return "index";

        } else {
            
            return "iniciarSesion";

        }
    }

//    public String registro(){
//        return "index";
//    }
}
