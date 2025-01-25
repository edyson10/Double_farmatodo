package com.example.demo.Model.DTO;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Getter
@Setter
public class UserDTO {

    UUID id;
    String nombres;
    String apellidos;
    LocalDateTime fechaCreacion;
    LocalDateTime fechaActualizacion;
}
