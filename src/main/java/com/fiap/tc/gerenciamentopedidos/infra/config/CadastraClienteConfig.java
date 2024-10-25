package com.fiap.tc.gerenciamentopedidos.infra.config;

import com.fiap.tc.gerenciamentopedidos.domain.gateway.CadastrarClienteInterface;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.CadastrarClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadastraClienteConfig {

    @Bean
    public CadastrarClienteUseCase cadastrarClienteUseCase(CadastrarClienteInterface cadastrarClienteInterface) {
        return new CadastrarClienteUseCase(cadastrarClienteInterface);
    }


}
