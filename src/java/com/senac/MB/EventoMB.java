/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.MB;

import com.senac.Bean.Evento;
import com.senac.NEG.EventoNeg;
import com.senac.util.Mensagem;
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

        try {
            neg.salvar(evento);
            Mensagem.add("Operação executada com sucesso!");
            return "ListarEvento";
        } catch (Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }

    public List<Evento> listar() {
        return neg.listarEvento();
    }

    public void editar(Evento evento) {
        this.evento = evento;
    }

    public String excluir() {
        try {
            neg.excluir(evento);
            Mensagem.add("Operação executada com sucesso!");
            return "ListarEvento";
        } catch (Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }
}
