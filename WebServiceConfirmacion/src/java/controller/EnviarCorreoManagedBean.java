/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.EnviarEmail;

/**
 *
 * @author luis
 */
@Named(value = "enviarCorreoManagedBean")
@RequestScoped
public class EnviarCorreoManagedBean {
    private String companyName;
    private String asunto;
    private String userEmail; 
    private String userPassword;
    private String cuerpoMessage;
    private String textValidacion;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCuerpoMessage() {
        return cuerpoMessage;
    }

    public void setCuerpoMessage(String cuerpoMessage) {
        this.cuerpoMessage = cuerpoMessage;
    }
    
    
  
    /**
     * Creates a new instance of EnviarCorreoManagedBean
     */
    
    public EnviarCorreoManagedBean() {
        
    }
    
    
    public String enviarCorreo(){
        EnviarEmail enviarEmail = new EnviarEmail();
        enviarEmail.setNameCompany(companyName);
        
        if(enviarEmail.enviarCorreo(asunto, userEmail, userPassword, cuerpoMessage)){
            
            FacesMessage correoEnviado = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correo enviado correctamente", null);
            FacesContext.getCurrentInstance().addMessage("componentForm:textValidacion", correoEnviado);
            
            
        }else{
            FacesMessage correoEnviado = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Correo no enviado", null);
            FacesContext.getCurrentInstance().addMessage("componentForm:", correoEnviado);
        }
        
        return "";
    }
}
