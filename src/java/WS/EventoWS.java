/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Bean.Estabelecimento;
import java.util.ArrayList;
import javax.jws.WebParam;
import javax.jws.WebService;
import Bean.Evento;
import java.util.Date;
import NEG.EstabelecimentoNeg;
import NEG.EventoNeg;
import javax.jws.WebMethod;


/**
 *
 * @author thiago
 */
@WebService
public class EventoWS {

    public boolean insereEvento(
            @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
            @WebParam(name = "cnpj") long cnpj, 
            @WebParam(name = "nome") String nome, 
            @WebParam(name = "descricao") String descricao, 
            @WebParam(name = "dataHoraInicial") Date dataHoraInicial, 
            @WebParam(name = "dataHoraFinal") Date dataHoraFinal) throws Exception {
        

        EstabelecimentoNeg esNeg = new EstabelecimentoNeg();
        EventoNeg evNeg = new EventoNeg();
        Evento ev = new Evento();
        
        Estabelecimento es = esNeg.retornaEstabelecimento(idEstabelecimento);
        if(es == (null)){
            throw new Exception("Nao foi encontrado estabelecimento com este ID.");
        }else if(es.getCnpj() != cnpj){
                throw new Exception("CNPJ nao pertence ao estabelecimento informado.");
        }
        
        ev.setIdEstabelecimento(es);
        ev.setDescricao(descricao);
        ev.setNome(nome);
        ev.setDataHoraInicial(dataHoraInicial);
        ev.setDataHoraFinal(dataHoraFinal);
        
        try {
            evNeg.salvar(ev);
        } catch (Exception e) {
            throw new Exception("Houve algum erro ao tentar salvar o Evento.");
        }        
        return true;
    }
    
    @WebMethod(exclude = true)
    public ArrayList<Evento> listaEventosFuturos(
             @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
             @WebParam(name = "cnpj") long cnpj){
        return null;
    }
    
        @WebMethod(exclude = true)
        public ArrayList<Evento> listaHistoricoEventos(
                 @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
                 @WebParam(name = "cnpj") long cnpj){
        return null;
    }
        
    
}
