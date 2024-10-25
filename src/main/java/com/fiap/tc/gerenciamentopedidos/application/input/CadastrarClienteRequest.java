package com.fiap.tc.gerenciamentopedidos.application.input;

public record CadastrarClienteRequest(
         Long clienteId,
         String nome,
         String email,
         String telefone
) {
}
