/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.NEG;

import com.senac.Bean.Evento;
import com.senac.DB.EventoDB;
import java.util.List;

/**
 *
 * @author jeisonmarques
 */
public class EventoNeg {

    private EventoDB db;

    public EventoNeg() {
        db = new EventoDB();
    }

    public void salvar(Evento evento) {
        db.salvarEvento(evento);
    }

    public List<Evento> listarEvento() {
        return db.retornaEventos();
    }

    public void excluir(Evento evento) {
        db.excluir(evento);
    }
}
