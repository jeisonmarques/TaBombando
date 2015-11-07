package MB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jeisonmarques
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    private String login;
    
    private String senha;
    
    /**
     * Creates a new instance of LoginMB
     */
    public LoginMB() {
    }
    
    public String logar(){
        return "Home";
    }

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
    
    public String teste()
    {
        return  "admin/Home";
    }
    
}
