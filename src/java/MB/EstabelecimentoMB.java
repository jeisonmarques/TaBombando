/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Bean.Estabelecimento;
import NEG.EstabelecimentoNeg;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jeisonmarques
 */
@ManagedBean
@RequestScoped
public class EstabelecimentoMB {

    /**
     * Creates a new instance of EstabelecimentoMB
     */
    private EstabelecimentoNeg neg;
        
    private Estabelecimento estab;

    public Estabelecimento getEstab() {
        return estab;
    }

    public void setEstab(Estabelecimento estab) {
        this.estab = estab;
    }

    public EstabelecimentoMB() {
        estab = new Estabelecimento();
        neg = new EstabelecimentoNeg();
    }
 
    public String salvarEstabelecimento()
    {  
        neg.salvar(estab);
        
        return  null;
    }
    
    public List<Estabelecimento> listar() {
        List<Estabelecimento> lista = neg.listarEstabelecimento();
        //System.out.println(">>>>> " + lista);
       return lista;
    }
    
    public void editar(Estabelecimento estab)
    {
        this.estab = estab;
    }
}
