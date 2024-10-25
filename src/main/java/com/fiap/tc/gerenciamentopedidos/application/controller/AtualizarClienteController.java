package com.fiap.tc.gerenciamentopedidos.application.controller;


import com.fiap.tc.gerenciamentopedidos.application.input.AtualizarClienteRequest;
import com.fiap.tc.gerenciamentopedidos.application.output.ClienteResponse;
import com.fiap.tc.gerenciamentopedidos.domain.entity.Cliente;
import com.fiap.tc.gerenciamentopedidos.domain.usecase.AtualizarClienteUseCase;
import com.fiap.tc.gerenciamentopedidos.infra.adapter.repository.ClienteEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class AtualizarClienteController {

    private final ClienteDtoMapper clienteDtoMapper;
    private final AtualizarClienteUseCase atualizarClienteUseCase;

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponse>atualizarUsuario(@PathVariable Long id,
                                                           @RequestBody AtualizarClienteRequest clienteRequest){
        Cliente clienteAtualizado = atualizarClienteUseCase.atualizarCliente(id,clienteDtoMapper.toCliente(clienteRequest));

         if(clienteAtualizado==null)
         {
           return  ResponseEntity.notFound().build();
         }

        ClienteResponse clienteResponse=clienteDtoMapper.toClienteResponse(clienteAtualizado);

        return ResponseEntity.ok(clienteResponse);

    }

}
