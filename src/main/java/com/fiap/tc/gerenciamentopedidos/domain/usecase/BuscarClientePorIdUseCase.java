package com.fiap.tc.gerenciamentopedidos.domain.usecase;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.exception.ClienteNotFoundException;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.BuscarClientePorIdInterface;

import java.util.Base64;

public class BuscarClientePorIdUseCase {

    private final BuscarClientePorIdInterface buscarClientePorIdInterface;

    public BuscarClientePorIdUseCase(BuscarClientePorIdInterface buscarClientePorIdInterface) {
        this.buscarClientePorIdInterface = buscarClientePorIdInterface;
    }

    public Cliente buscarClientePorId(Long id){
        Cliente cliente = buscarClientePorIdInterface.buscarClientePorId(id);

        return cliente;
    }

}
