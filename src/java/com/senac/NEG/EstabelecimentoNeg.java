/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.NEG;

import com.senac.Bean.Estabelecimento;
import com.senac.DB.EstabelecimentoDB;
import java.util.List;

/**
 *
 * @author jeisonmarques
 */
public class EstabelecimentoNeg {
    
    private EstabelecimentoDB db;
    
    public EstabelecimentoNeg()
    {
        db = new EstabelecimentoDB();
    }
    
    public void salvar(Estabelecimento estab)
    {
        db.salvarEstabelecimento(estab);
    }
    
    public List<Estabelecimento> listarEstabelecimento()
    {
        return db.retornaEstabelecimentos();
    }
    
    public Estabelecimento retornaEstabelecimento(int id)
    {
        Estabelecimento estab = new Estabelecimento();
        estab.setIdEstabelecimento(id);
        return db.retornaEstabeleciemnto(estab);
    }
}
