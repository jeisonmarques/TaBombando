/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import Bean.Estabelecimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jeisonmarques
 */
public class EstabelecimentoDB {

    private EntityManager em;
    
    public EstabelecimentoDB() {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("TaBombando");
        em = emf.createEntityManager();
    }
    
    public void salvarEstabelecimento(Estabelecimento estab)
    {
        em.getTransaction().begin();
        em.merge(estab);
        em.getTransaction().commit();
    }
    
    public List<Estabelecimento> retornaEstabelecimentos()
    {
        Query q = em.createQuery("Select e from Estabelecimento e");
        return q.getResultList();
    } 
    
    public Estabelecimento retornaEstabeleciemnto(int id)
    {
        return null;
    }
}
