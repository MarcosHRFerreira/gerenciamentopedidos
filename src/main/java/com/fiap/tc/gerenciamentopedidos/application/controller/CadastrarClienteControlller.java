package com.fiap.tc.gerenciamentopedidos.application.controller;

import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.input.CadastrarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.domain.output.ClienteResponse;
import com.fiap.tc.gerenciamentopedidos.domain.mapper.ClienteDtoMapper;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.CadastrarClienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class CadastrarClienteControlller {

    private final ClienteDtoMapper clienteMapper;
    private final CadastrarClienteUseCase cadastrarClienteUseCase;

    @PostMapping
    public ResponseEntity<ClienteResponse> cadastrarCliente(@RequestBody CadastrarClienteRequest cadastrarClienteRequest) {

        Cliente cliente = clienteMapper.toCliente(cadastrarClienteRequest);

        Cliente clienteCadastrado = cadastrarClienteUseCase.cadastrarCliente(cliente);

        ClienteResponse clienteResponse = clienteMapper.toClienteResponse(clienteCadastrado);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clienteResponse.clienteId())
                .toUri();

        return ResponseEntity.created(uri).body(clienteResponse);
    }


}
