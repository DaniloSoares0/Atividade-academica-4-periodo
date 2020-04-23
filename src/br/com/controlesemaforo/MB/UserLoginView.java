package br.com.controlesemaforo.MB;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

@ManagedBean
public class UserLoginView {
	
	private String username;
    
    private String password;
 
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public String login() {
        FacesMessage message = null;
        boolean loggedIn = false;
         
        if(username != null && username.equals("Danilo") && password != null && password.equals("Danilo")   ||
           username != null && username.equals("Douglas") && password != null && password.equals("Douglas") ||
           username != null && username.equals("Getulio") && password != null && password.equals("Getulio") ||
           username != null && username.equals("Matheus") && password != null && password.equals("Matheus") ) {
        	
            loggedIn = true;
            return "Sucesso";
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Falha ao Logar", "Usuario ou senha invalido");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
		return null;
    }   

}
