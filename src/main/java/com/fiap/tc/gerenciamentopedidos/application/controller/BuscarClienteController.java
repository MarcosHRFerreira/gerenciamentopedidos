package com.fiap.tc.gerenciamentopedidos.application.controller;


import com.fiap.tc.gerenciamentopedidos.domain.output.ClienteResponse;
import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.mapper.ClienteDtoMapper;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.BuscarClientePorIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class BuscarClienteController {

    private final ClienteDtoMapper clienteDtoMapper;
    private final BuscarClientePorIdUseCase buscarClientePorIdUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse>buscaCliente(@PathVariable Long id){
        Cliente clienteBuscado= buscarClientePorIdUseCase.buscarClientePorId(id);
        return ResponseEntity.ok(clienteDtoMapper.toClienteResponse(clienteBuscado));
    }


}
