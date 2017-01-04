/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import entities.EmployeeMaster;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import sessions.EmployeeMasterFacadeLocal;

/**
 *
 * @author jadanu1000
 */
@ManagedBean(name = "Login")
@RequestScoped
public class Login implements Serializable {

    @EJB
    private EmployeeMasterFacadeLocal employeeMasterFacade;
    //<editor-fold defaultstate="collapsed" desc="fields">
    String username;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //</editor-fold>

    public void btn_sign_in_clicked(ActionEvent event) {
        System.out.println("btn clicked...");

    }

    public String login() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        EmployeeMaster entEmployeeMaster = employeeMasterFacade.find(username);
        if (username == null || password == null) {
            loggedIn = false;
        } else if (entEmployeeMaster == null) {
            loggedIn = false;
        } else if (entEmployeeMaster.getPassword().equals(password)) {
            loggedIn = true;
        }

        if (loggedIn) {
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", loggedIn);
            return "/pages/TestPage1";
        } else {
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", loggedIn);
            return "";
        }

    }

    //<editor-fold defaultstate="collapsed" desc="constructor">
    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc="init">

    @PostConstruct
    public void init() {
    }
    //</editor-fold>
}
