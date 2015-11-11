/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.DB;

import com.senac.Bean.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jeisonmarques
 */
public class UsuarioDB {
    
    private EntityManager em;
    
    public UsuarioDB()
    {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("TaBombando");
        em = emf.createEntityManager();
    }
    
    public void salvarUsuario(Usuario usuario)
    {
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
    }
    
    public List<Usuario> retornaUsuarios()
    {
        Query q = em.createQuery("Select u from Usuario u");
        return q.getResultList();
    }
    
}
