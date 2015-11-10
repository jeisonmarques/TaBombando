/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEG;

import Bean.Usuario;
import DB.UsuarioDB;
import java.util.List;

/**
 *
 * @author jeisonmarques
 */
public class UsuarioNeg {
    
    private UsuarioDB db;
    
    public UsuarioNeg()
    {
        db = new UsuarioDB();
    }
    
    public void salvar(Usuario usr)
    {
        db.salvarUsuario(usr);
    }
    
    public List<Usuario> listarUsuario()
    {
        return db.retornaUsuarios();
    }
    
    public boolean logar()
    {
        return true;
    }
    
}
