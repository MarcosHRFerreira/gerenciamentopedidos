package com.fiap.tc.gerenciamentopedidos.domain.usecase;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.CadastrarClienteInterface;

public class CadastrarClienteUseCase {


    private final CadastrarClienteInterface cadastrarClienteInterface;

    public CadastrarClienteUseCase(CadastrarClienteInterface cadastrarClienteInterface) {
        this.cadastrarClienteInterface = cadastrarClienteInterface;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return cadastrarClienteInterface.cadastraCliente(cliente);
    }

}
