/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jeisonmarques
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    
    public String login;
    public String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
     * Creates a new instance of LoginMB
     */
    public LoginMB() {
    }
    
    public String logar()
    {
        if("admin".equals(this.login) && "admin".equals(this.senha))
        {
            return "home";
        }
        HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession( true );  

        return "Erro no login";
    }
    
}
