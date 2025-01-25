package com.example.demo.Repository;

import com.example.demo.Model.Entity.Ticket;
import com.example.demo.Model.Enum.Estatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {

    List<Ticket> findByEstatus(Estatus estatus);
    List<Ticket> findByUsuarioId(UUID usuarioId);
}
