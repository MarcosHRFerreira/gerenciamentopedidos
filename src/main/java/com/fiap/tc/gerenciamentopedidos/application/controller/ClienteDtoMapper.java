package com.fiap.tc.gerenciamentopedidos.application.controller;

import com.fiap.tc.gerenciamentopedidos.application.input.AtualizarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.application.input.CadastrarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.application.output.ClienteResponse;
import org.springframework.stereotype.Component;

@Component
public class ClienteDtoMapper {

   public Cliente toCliente(CadastrarClienteRequest cadastrarClienteRequest){
       return new Cliente(null, cadastrarClienteRequest.nome(), cadastrarClienteRequest.email(),cadastrarClienteRequest.telefone());
   }

    public Cliente toCliente(AtualizarClienteRequest atualizaClienteRequest){
        return new Cliente(atualizaClienteRequest.clienteId(), atualizaClienteRequest.nome(), atualizaClienteRequest.email(),atualizaClienteRequest.telefone());
    }

   public ClienteResponse toClienteResponse(Cliente cliente){
       return  new ClienteResponse(cliente.getClienteId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
   }



}
