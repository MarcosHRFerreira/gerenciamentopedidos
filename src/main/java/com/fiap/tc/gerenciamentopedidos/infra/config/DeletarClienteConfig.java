package com.fiap.tc.gerenciamentopedidos.infra.config;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.DeletarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.BuscarClientePorIdUseCase;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.DeletarClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeletarClienteConfig {

    @Bean
    public DeletarClienteUseCase deletarClienteUseCase(
            DeletarClienteInterface deletarClienteInterface,
            BuscarClientePorIdUseCase buscarClientePorIdUseCase
    ){
        return new DeletarClienteUseCase(deletarClienteInterface,buscarClientePorIdUseCase);
    }

}
