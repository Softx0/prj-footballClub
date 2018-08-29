/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.EnviarEmail;

/**
 *
 * @author luis
 */
@WebService(serviceName = "ConfirmacionWebService")
public class ConfirmacionWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "confirmarUsuario")
    public boolean confirmarUsuario(@WebParam(name = "asunto") String asunto, @WebParam(name = "userEmail") String userEmail, @WebParam(name = "userPassword") String userPassword, @WebParam(name = "cuerpoMessage") String cuerpoMessage) {
       EnviarEmail enviarEmail = new EnviarEmail();
       if(enviarEmail.enviarCorreo(asunto, userEmail, userPassword, cuerpoMessage)){
           return true;
       }else{
           return false;
       }
    }
}
