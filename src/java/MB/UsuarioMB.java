/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Bean.Usuario;
import NEG.UsuarioNeg;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jeisonmarques
 */
@ManagedBean
@RequestScoped
public class UsuarioMB {

    public String senha;
    public String reSenha;
    public Usuario usuario;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getReSenha() {
        return reSenha;
    }

    public void setReSenha(String reSenha) {
        this.reSenha = reSenha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
    public String salvar()
    {
        if(senha.contentEquals(reSenha))
        {
            UsuarioNeg neg = new UsuarioNeg();
            usuario.setSenha(senha);
            neg.salvar(usuario);
        }
        return "ListarUsuario";
    }
    
    public UsuarioMB() {
        usuario = new Usuario();
    }
    
    public List<Usuario> listar()
    {
        UsuarioNeg neg = new UsuarioNeg();
        return neg.listarUsuario(); 
    }
    
    public void editar(Usuario user)
    {
        this.usuario = user;
    }
}
