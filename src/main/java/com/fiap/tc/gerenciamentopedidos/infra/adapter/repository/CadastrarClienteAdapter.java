package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.gateway.CadastrarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import com.fiap.tc.gerenciamentopedidos.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CadastrarClienteAdapter implements CadastrarClienteInterface {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;

    @Override
    public Cliente cadastraCliente(Cliente cliente){
        ClienteEntity clienteEntity=clienteEntityMapper.toEntity(cliente);
        ClienteEntity novoCliente =  clienteRepository.save(clienteEntity);
        return clienteEntityMapper.toClienteResponse(novoCliente);

    }



}
