package com.example.demo.Service;

import com.example.demo.Model.DTO.TicketDTO;
import com.example.demo.Model.Enum.Estatus;

import java.util.List;
import java.util.UUID;

public interface TicketService {

    TicketDTO crearTicket(TicketDTO ticket);

    List<TicketDTO> listarTickets();

    List<TicketDTO> filtrarTicketsPorEstatus(Estatus estatus);

    List<TicketDTO> filtrarTicketsPorUsuario(UUID usuarioId);

    void eliminarTicket(UUID id);
}
