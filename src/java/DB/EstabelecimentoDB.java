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
    
    public Estabelecimento retornaEstabeleciemnto(Estabelecimento estab)
    {
        
        StringBuilder sb = new StringBuilder("Select e from Estabelecimento e where 1=1 ");

        if(estab.getIdEstabelecimento() !=null && estab.getIdEstabelecimento()!=0) {
            sb.append("and e.idEstabelecimento=:c ");
        }
        if(estab.getCnpj() !=0) {
            sb.append("and e.cnpj = :n ");
        }
        if(estab.getEndereco()!=null && !"".equals(estab.getEndereco())) {
            sb.append("and e.endereco like :e ");
        }
        if(estab.getFones()!=null && !"".equals(estab.getFones())) {
            sb.append("and c.telefone like :t ");
        }
        if(estab.getNome()!=null && !"".equals(estab.getNome())) {
            sb.append("and e.nome like :q ");
        }

        sb.append("order by e.nome");
        
        Query qry = em.createQuery(sb.toString());
        if(estab.getIdEstabelecimento() !=null && estab.getIdEstabelecimento()!=0) {
            qry.setParameter("c", estab.getIdEstabelecimento());
        }
        if(estab.getCnpj() !=0) {
            qry.setParameter("n", estab.getCnpj());
        }
        if(estab.getEndereco()!=null && !"".equals(estab.getEndereco())) {
            qry.setParameter("e", "%" + estab.getEndereco() + "%");
        }
        if(estab.getFones()!=null && !"".equals(estab.getFones())) {
            qry.setParameter("t", "%" + estab.getFones() + "%");
        }
        if(estab.getNome()!=null && !"".equals(estab.getNome())) {
            qry.setParameter("q", "%" + estab.getFones() + "%");
        }

        return (Estabelecimento) qry.getSingleResult();
    }
}
