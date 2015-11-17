/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.MB;

import com.senac.Bean.Usuario;
import com.senac.NEG.UsuarioNeg;
import com.senac.util.Mensagem;
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
    public UsuarioNeg neg;

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

    public String salvar() {
        if (senha.contentEquals(reSenha)) {
            usuario.setSenha(senha);
            neg.salvar(usuario);
            Mensagem.add("Operação executada com sucesso!");
        }
        return "ListarUsuario";
    }

    public UsuarioMB() {
        usuario = new Usuario();
        neg = new UsuarioNeg();
    }

    public List<Usuario> listar() {
        return neg.listarUsuario();
    }

    public void editar(Usuario user) {
        this.usuario = user;
    }
}
