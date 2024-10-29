package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.BuscarClientePorIdInterface;
import com.fiap.tc.gerenciamentopedidos.infra.repository.mapper.ClienteEntityMapper;
import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import com.fiap.tc.gerenciamentopedidos.infra.repository.ClienteRepository;
import org.springframework.stereotype.Component;

@Component
public class BuscarClientePorIdAdapter implements BuscarClientePorIdInterface {
    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;

    public BuscarClientePorIdAdapter(ClienteRepository clienteRepository, ClienteEntityMapper clienteEntityMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityMapper = clienteEntityMapper;
    }

    @Override
    public Cliente buscarClientePorId(Long id){
        ClienteEntity clienteBuscado = clienteRepository.findById(id).orElse(null);

       return clienteEntityMapper.toClienteResponse(clienteBuscado);
    }

}
