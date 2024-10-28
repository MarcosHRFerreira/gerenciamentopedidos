package com.fiap.tc.gerenciamentopedidos.application.input;

public record AtualizarClienteRequest(
        Long clienteId,
        String nome,
        String email,
        String telefone,
        String logradouro,
        String bairro,
        String cep,
        String complemento,
        String numero,
        String uf,
        String cidade
) {
}
