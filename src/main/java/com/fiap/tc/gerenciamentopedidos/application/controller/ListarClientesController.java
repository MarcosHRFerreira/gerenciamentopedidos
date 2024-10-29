package com.fiap.tc.gerenciamentopedidos.application.controller;


import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.mapper.ClienteDtoMapper;
import com.fiap.tc.gerenciamentopedidos.domain.output.ClienteResponse;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.ListarClientesUseCase;
import com.fiap.tc.gerenciamentopedidos.infra.repository.mapper.ClienteEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ListarClientesController {

    private final ClienteEntityMapper clienteEntityMapper;
    private final ListarClientesUseCase listarClientesUseCase;
    private final ClienteDtoMapper clienteDtoMapper;

    @GetMapping
    public ResponseEntity<List<ClienteResponse>>listarClientes(){
        List<Cliente> clientes = listarClientesUseCase.listarClientes();
        List<ClienteResponse> listaClienteResponse = clientes.stream().map(clienteDtoMapper::toClienteResponse).toList();

        return ResponseEntity.ok(listaClienteResponse);

    }

}
