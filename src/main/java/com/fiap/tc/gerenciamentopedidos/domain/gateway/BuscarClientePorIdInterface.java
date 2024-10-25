package com.fiap.tc.gerenciamentopedidos.domain.gateway;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;

public interface BuscarClientePorIdInterface {
    Cliente buscarClientePorId(Long id);
}
