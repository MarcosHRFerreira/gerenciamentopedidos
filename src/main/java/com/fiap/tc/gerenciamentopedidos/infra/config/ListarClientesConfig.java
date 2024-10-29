package com.fiap.tc.gerenciamentopedidos.infra.config;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.ListarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.ListarClientesUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListarClientesConfig {

    @Bean
    public ListarClientesUseCase listarClientesUseCase(
            ListarClienteInterface listarClienteInterface){
        return  new ListarClientesUseCase((listarClienteInterface));
    }

}
