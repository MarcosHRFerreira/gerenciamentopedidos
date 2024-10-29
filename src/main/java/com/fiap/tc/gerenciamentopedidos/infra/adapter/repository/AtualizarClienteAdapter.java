package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.AtualizarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.infra.repository.mapper.ClienteEntityMapper;
import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import com.fiap.tc.gerenciamentopedidos.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AtualizarClienteAdapter implements AtualizarClienteInterface {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;
    private final BuscarClientePorIdAdapter buscarClientePorIdAdapter;

    @Override
    public Cliente atualizarCliente(Long id, Cliente cliente){
        ClienteEntity clienteAtualizado= clienteRepository.save(clienteEntityMapper.toEntity(cliente));

        return clienteEntityMapper.toClienteResponse(clienteAtualizado);

    }
}
