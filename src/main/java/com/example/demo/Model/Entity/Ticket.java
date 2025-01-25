package com.example.demo.Model.Entity;

import com.example.demo.Model.Enum.Estatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue
    private UUID id;
    @NotNull
    private UUID usuarioId;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    @Enumerated(EnumType.STRING)
    @NotNull
    private Estatus estatus;
}
