package com.fiap.tc.gerenciamentopedidos.infra.config;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.AtualizarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.AtualizarClienteUseCase;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.BuscarClientePorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarClienteConfig {
    @Bean
    public AtualizarClienteUseCase atualizarClienteUseCase(
            AtualizarClienteInterface atualizarClienteInterface,
            BuscarClientePorIdUseCase buscarClientePorIdUseCase
    ){
        return new AtualizarClienteUseCase(atualizarClienteInterface,buscarClientePorIdUseCase);
    }
}
