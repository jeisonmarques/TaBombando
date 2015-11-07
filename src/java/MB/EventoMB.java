/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Bean.Evento;
import NEG.EventoNeg;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jeisonmarques
 */
@ManagedBean
@RequestScoped
public class EventoMB {
    
    public Evento evento;
    public EventoNeg neg;
    
    public Evento getEvento() {
        return evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public EventoMB() {
        evento = new Evento();
        neg = new EventoNeg();
    }
    
    public void salvar() {
        System.out.println(">>>>>> "+evento.toString());
        Date d = new Date();
        evento.setDataHoraInicial(d);
        evento.setDataHoraFinal(d);
        System.out.println(">>>>>> "+evento.toString());
        
        neg.salvar(evento);
    }
    
    public List<Evento> listar()
    {
        return neg.listarEvento();
    }
    
    public void editar(Evento evento)
    {
        this.evento = evento;
    }
    
    public String excluir()
    {
        System.out.println(evento.getIdEvento());
        neg.excluir(evento);
        return null;
    }
}
