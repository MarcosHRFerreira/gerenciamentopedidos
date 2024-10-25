package com.fiap.tc.gerenciamentopedidos.application.input;

public record AtualizarClienteRequest(
        Long clienteId,
        String nome,
        String email,
        String telefone
) {
}
