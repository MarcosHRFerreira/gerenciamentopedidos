package com.fiap.tc.gerenciamentopedidos.domain.usecase;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.ListarClienteInterface;

import java.util.List;

public class ListarClientesUseCase {
    private final ListarClienteInterface listarClienteInterface;

    public ListarClientesUseCase(ListarClienteInterface listarClienteInterface) {
        this.listarClienteInterface = listarClienteInterface;
    }

    public List<Cliente> listarClientes(){
        return listarClienteInterface.listarClientes();
    }

}
