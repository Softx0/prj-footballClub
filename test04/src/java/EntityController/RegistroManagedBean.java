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
@Named(value = "registroManagedBean")
@RequestScoped
public class RegistroManagedBean {

 //  @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_17155/WebServiceConfirmacion/ConfirmacionWebService.wsdl")
   // private ConfirmacionWebService_Service service;

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

    /**
     * Creates a new instance of RegistroManagedBean
     */
    public RegistroManagedBean() {
    }

    public String registro() {

        Validacion vali = new Validacion();

        if (vali.registro(username, password, email, rol)) {
        
                
           // confirmarUsuario("Registro en Foot", email, password, "Xmail es un web service que te brinda la oportunidad de enviar correos electronicos, este tiene gran aplicacion, ya que te brinda un conjunto de metodos que te permiten desarrollar las actividades usuales que involucran un correo electronico");

            return "index";

        } else {

            return "registro";

        }
    }

//    private boolean confirmarUsuario(java.lang.String asunto, java.lang.String userEmail, java.lang.String userPassword, java.lang.String cuerpoMessage) {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        webservice.ConfirmacionWebService port = service.getConfirmacionWebServicePort();
//        return port.confirmarUsuario(asunto, userEmail, userPassword, cuerpoMessage);
//    }

    
 

}
