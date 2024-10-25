package com.fiap.tc.gerenciamentopedidos.domain.entity;

import com.fiap.tc.gerenciamentopedidos.domain.entity.validation.EmailValidator;

public class Cliente {

    private Long clienteId;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(Long clienteId, String nome, String email, String telefone) {
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if(email == null || email.isEmpty() || !EmailValidator.isValid(email)) {
            throw new IllegalArgumentException("Email deve ser válido");
        }

        this.clienteId=clienteId;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
