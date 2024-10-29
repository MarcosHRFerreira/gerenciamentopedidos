package com.fiap.tc.gerenciamentopedidos.domain.gateway;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;

import java.util.List;

public interface ListarClienteInterface {
    List<Cliente> listarClientes();
}
