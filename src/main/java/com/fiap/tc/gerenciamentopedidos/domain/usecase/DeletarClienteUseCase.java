package com.fiap.tc.gerenciamentopedidos.domain.usecase;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.DeletarClienteInterface;

import java.util.List;

public class DeletarClienteUseCase {

    private final DeletarClienteInterface deletarClienteInterface;
    private final BuscarClientePorIdUseCase buscarClientePorIdUseCase;


    public DeletarClienteUseCase(DeletarClienteInterface deletarClienteInterface, BuscarClientePorIdUseCase buscarClientePorIdUseCase) {
        this.deletarClienteInterface = deletarClienteInterface;
        this.buscarClientePorIdUseCase = buscarClientePorIdUseCase;
    }

    public boolean deletarCliente(Long id){

        buscarClientePorIdUseCase.buscarClientePorId(id);

        return deletarClienteInterface.deletarUsuario(id);

    }


}
