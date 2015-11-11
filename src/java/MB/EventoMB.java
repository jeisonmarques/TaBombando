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

    public String salvar() {
        Date d = new Date();
        //evento.setDataHoraInicial(d);
        //evento.setDataHoraFinal(d);
        neg.salvar(evento);
        
        return "ListarEvento";
    }

    public List<Evento> listar() {
        return neg.listarEvento();
    }

    public void editar(Evento evento) {
        System.out.println(evento.toString());
        this.evento = evento;
    }

    public String excluir() {
        try {
            neg.excluir(evento);
            return "ListarEvento";
        } catch (Exception e) {

        }
        return null;
    }
}
