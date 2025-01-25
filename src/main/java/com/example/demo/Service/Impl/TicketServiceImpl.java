package com.example.demo.Service.Impl;

import com.example.demo.Converter.TicketConverter;
import com.example.demo.Converter.UserConverter;
import com.example.demo.Model.DTO.TicketDTO;
import com.example.demo.Model.Enum.Estatus;
import com.example.demo.Repository.TicketRepository;
import com.example.demo.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    private TicketConverter ticketConverter;

    @Override
    public TicketDTO crearTicket(TicketDTO ticketDTO) {
        return ticketConverter.entityToModel(ticketRepository.save(ticketConverter.modelToEntidy(ticketDTO)));
    }

    @Override
    public List<TicketDTO> listarTickets() {
        return ticketRepository.findAll().stream().map(ticketConverter::entityToModel).collect(Collectors.toList());
    }

    @Override
    public List<TicketDTO> filtrarTicketsPorEstatus(Estatus estatus) {
        return List.of();
    }

    @Override
    public List<TicketDTO> filtrarTicketsPorUsuario(UUID usuarioId) {
        return List.of();
    }

    @Override
    public void eliminarTicket(UUID id) {
        ticketRepository.deleteById(id);
    }
}
