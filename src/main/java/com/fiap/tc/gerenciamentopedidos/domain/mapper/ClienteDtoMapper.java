package com.fiap.tc.gerenciamentopedidos.domain.mapper;

import com.fiap.tc.gerenciamentopedidos.application.input.AtualizarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.application.input.CadastrarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.application.output.ClienteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Component
@Mapper(componentModel = "spring")
public interface ClienteDtoMapper {

    /**
     * @param cadastrarClienteRequest
     * @return
     */
    @Mapping(target = "clienteId", ignore = true)
    Cliente toCliente(CadastrarClienteRequest cadastrarClienteRequest);

    /**
     * @param atualizarClienteRequest
     * @return
     */
    @Mapping(target = "clienteId", ignore = true)
    Cliente toCliente(AtualizarClienteRequest atualizarClienteRequest);

    /**
     * @param cliente
     * @return
     */
    ClienteResponse toClienteResponse(Cliente cliente);








}
