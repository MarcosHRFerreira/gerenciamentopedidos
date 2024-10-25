package com.fiap.tc.gerenciamentopedidos.domain.gateway;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;

public interface AtualizarClienteInterface {

    Cliente atualizarCliente(Long id, Cliente cliente);

}
