/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Bean.Evento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jeisonmarques
 */
public class EventoDB {

    private EntityManager em;
    
    public EventoDB() { 
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("TaBombando");
        em = emf.createEntityManager();
    }
    
    public void salvarEvento(Evento evento)
    {
        System.out.println(evento.toString());
        em.getTransaction().begin();
        em.merge(evento);
        em.getTransaction().commit();
    }
    
    public List<Evento> retornaEventos()
    {
        Query q = em.createQuery("Select e from Evento e");
        return q.getResultList();
    }
    
    public void excluir(Evento evento)
    {
        em.getTransaction().begin();
        em.remove(em.find(Evento.class, evento.getIdEvento()));
        em.getTransaction().commit();
    }
}