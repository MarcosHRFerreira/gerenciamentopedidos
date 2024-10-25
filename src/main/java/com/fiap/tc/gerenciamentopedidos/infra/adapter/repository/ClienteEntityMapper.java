package com.fiap.tc.gerenciamentopedidos.infra.adapter.repository;


import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteEntityMapper {

   public ClienteEntity toEntity(Cliente cliente){
       return new ClienteEntity(cliente.getClienteId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
   }

   public Cliente toClienteResponse(ClienteEntity clienteEntity){

       if (clienteEntity == null) {
           return new Cliente();
       }

       return  new Cliente(clienteEntity.getClienteId(), clienteEntity.getNome(), clienteEntity.getEmail(), clienteEntity.getTelefone());
   }

}
