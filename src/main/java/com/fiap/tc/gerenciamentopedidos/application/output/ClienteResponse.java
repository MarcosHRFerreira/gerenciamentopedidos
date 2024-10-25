package com.fiap.tc.gerenciamentopedidos.application.output;

public record ClienteResponse(
        Long clienteId,
        String nome,
        String email,
        String telefone
) {
}
