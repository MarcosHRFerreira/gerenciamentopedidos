package com.fiap.tc.gerenciamentopedidos.domain.usecase;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.AtualizarClienteInterface;

public class AtualizarClienteUseCase {

    private final AtualizarClienteInterface atualizarClienteInterface;
    private final BuscarClientePorIdUseCase buscarClientePorIdUseCase;


    public AtualizarClienteUseCase(AtualizarClienteInterface atualizarClienteInterface, BuscarClientePorIdUseCase buscarClientePorIdUseCase) {
        this.atualizarClienteInterface = atualizarClienteInterface;
        this.buscarClientePorIdUseCase = buscarClientePorIdUseCase;
    }

    public Cliente atualizarCliente(Long id, Cliente cliente){
        Cliente clienteBuscado = buscarClientePorIdUseCase.buscarClientePorId(id);

        clienteBuscado.setNome(cliente.getNome());
        clienteBuscado.setEmail(cliente.getEmail());
        clienteBuscado.setTelefone(cliente.getTelefone());

        return atualizarClienteInterface.atualizarCliente(id,clienteBuscado);

    }


}
