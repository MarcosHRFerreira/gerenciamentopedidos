package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.DeletarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarClienteAdapter implements DeletarClienteInterface {

    private final ClienteRepository clienteRepository;

    @Override
    public boolean deletarUsuario(Long id){
        clienteRepository.deleteById(id);
        return  true;
    }

}
