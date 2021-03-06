/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.NEG;

import com.senac.Bean.Usuario;
import com.senac.DB.UsuarioDB;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author jeisonmarques
 */
public class UsuarioNeg {

    private UsuarioDB db;

    public UsuarioNeg() {
        db = new UsuarioDB();
    }

    public void salvar(Usuario usr) {
        db.salvarUsuario(usr);
    }

    public List<Usuario> listarUsuario() {
        return db.retornaUsuarios();
    }

    public boolean logar(String usuario, String senha) {
        try {
            db.retornaUsuario(usuario, senha);
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

}
