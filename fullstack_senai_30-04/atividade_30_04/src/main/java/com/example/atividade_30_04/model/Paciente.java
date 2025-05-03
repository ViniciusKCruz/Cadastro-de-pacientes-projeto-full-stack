package com.example.atividade_30_04.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;

    @NotBlank(message = "Deve ser um telefone válido")
    private String telefone;

    @NotBlank(message = "O e-mail não pode ser vazio e deve ser um e-mail existente")
    private String email;

    @NotBlank(message = "A senha não pode ser vazia")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    private String senha;

    public Paciente() {
    }

    public Paciente(Long id, String nome, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome não pode ser vazio") @NotBlank(message = "Deve ser um nome válido") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome não pode ser vazio") @NotBlank(message = "Deve ser um nome válido") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O telefone não pode ser vazio") @NotBlank(message = "Deve ser um telefone válido") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone não pode ser vazio") @NotBlank(message = "Deve ser um telefone válido") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "O e-mail não pode ser vazio") @NotBlank(message = "Deve ser um e-mail válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail não pode ser vazio") @NotBlank(message = "Deve ser um e-mail válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha não pode ser vazia") @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha não pode ser vazia") @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres") String senha) {
        this.senha = senha;
    }
}
