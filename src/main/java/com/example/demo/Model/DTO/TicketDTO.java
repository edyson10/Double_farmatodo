package com.example.demo.Model.DTO;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Getter
@Setter
public class TicketDTO {

    UUID id;
    UUID usuarioId;
    LocalDateTime fechaCreacion;
    LocalDateTime fechaActualizacion;
    String estatus;
}
