package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;


import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.ListarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.domain.mapper.ClienteDtoMapper;
import com.fiap.tc.gerenciamentopedidos.domain.output.ClienteDeletadoResponse;
import com.fiap.tc.gerenciamentopedidos.infra.repository.ClienteRepository;
import com.fiap.tc.gerenciamentopedidos.infra.repository.mapper.ClienteEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarClienteAdapter implements ListarClienteInterface {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;


    @Override
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll().stream().map(clienteEntityMapper::toClienteResponse).toList();
    }

}
