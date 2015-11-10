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


/**
 *
 * @author thiago
 */
@WebService
public class EventoNegWS {

    public boolean insereEvento(
            @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
            @WebParam(name = "cnpj") long cnpj, 
            @WebParam(name = "nome") String nome, 
            @WebParam(name = "descricao") String descricao, 
            @WebParam(name = "dataHoraInicial") Date dataHoraInicial, 
            @WebParam(name = "dataHoraFinal") Date dataHoraFinal) {
        

        EstabelecimentoNeg esn = new EstabelecimentoNeg();
        
        
        Evento ev = new Evento();
        ev.setDescricao(descricao);
        ev.setNome(nome);
        ev.setDataHoraInicial(dataHoraInicial);
        ev.setDataHoraFinal(dataHoraFinal);
        
        
        
        return true;
    }
    
    public ArrayList<Evento> listaEventosFuturos(
             @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
             @WebParam(name = "cnpj") long cnpj){
        return null;
    }
    
        public ArrayList<Evento> listaHistoricoEventos(
                 @WebParam(name = "idEstabelecimento") int idEstabelecimento, 
                 @WebParam(name = "cnpj") long cnpj){
        return null;
    }
        
    
}
