package com.fiap.tc.gerenciamentopedidos.infra.repository.mapper;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {


    ClienteEntityMapper INSTANCE = Mappers.getMapper(ClienteEntityMapper.class);

    /**
     * @param clienteEntity
     * @return
     */
    Cliente toClienteResponse(ClienteEntity clienteEntity);


    /**
     * @param cliente
     * @return
     */
    ClienteEntity toEntity(Cliente cliente);

}
