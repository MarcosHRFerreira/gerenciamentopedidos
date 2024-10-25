package com.fiap.tc.gerenciamentopedidos.infra.config;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.BuscarClientePorIdInterface;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.BuscarClientePorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarClientePorIdConfig {
    @Bean
    public BuscarClientePorIdUseCase buscarClientePorIdUseCase(BuscarClientePorIdInterface buscarClientePorIdInterface){
        return new BuscarClientePorIdUseCase(buscarClientePorIdInterface);
    }
}
