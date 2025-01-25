package com.example.demo.Converter;

import com.example.demo.Model.DTO.TicketDTO;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.Entity.Ticket;
import com.example.demo.Model.Entity.Usuario;
import com.example.demo.Model.Enum.Estatus;
import org.springframework.stereotype.Service;

@Service
public class TicketConverter {

    public Ticket modelToEntidy(TicketDTO model) {
        Ticket ticket = new Ticket();
        ticket.setId(model.getId());
        ticket.setUsuarioId(model.getUsuarioId());
        ticket.setFechaCreacion(model.getFechaCreacion());
        ticket.setFechaActualizacion(model.getFechaActualizacion());
        ticket.setEstatus(Estatus.valueOf(model.getEstatus()));
        return ticket;
    }

    public TicketDTO entityToModel(Ticket ticket){
        TicketDTO model = new TicketDTO();
        model.setId(model.getId());
        model.setUsuarioId(ticket.getUsuarioId());
        model.setFechaCreacion(ticket.getFechaCreacion());
        model.setFechaActualizacion(ticket.getFechaActualizacion());
        model.setEstatus(ticket.getEstatus().toString());
        return model;
    }
}
