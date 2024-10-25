package com.fiap.tc.gerenciamentopedidos.infra.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    @NonNull
    private String nome;
    @NonNull
    private String email;
    @NonNull
    private String telefone;


}
