package com.example.atividade_30_04.service;

import com.example.atividade_30_04.model.Paciente;
import com.example.atividade_30_04.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class PacienteService {
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarPaciente() {
        return pacienteRepository.findAll();
    }

    public Paciente salvar(@Valid Paciente paciente) {
        if(pacienteRepository.findByEmail(paciente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("E-mail já cadastrado!");
        }
        return pacienteRepository.save(paciente);
    }

    public Paciente atualizar(@Valid Paciente paciente) {
        Paciente pacienteAtualizar = pacienteRepository.findById(paciente.getId())
                .orElseThrow(()-> new IllegalArgumentException("Paciente não encontrado"));

        pacienteAtualizar.setNome(paciente.getNome());
        pacienteAtualizar.setEmail(paciente.getEmail());
        pacienteAtualizar.setTelefone(paciente.getTelefone());
        pacienteAtualizar.setSenha(paciente.getSenha());

        return pacienteRepository.save(paciente);
    }

    public void excluir(String email) {
        Paciente paciente = pacienteRepository.findByEmail(email)
                .orElseThrow(()-> new IllegalArgumentException("Conta do paciente não encontrado!"));

                pacienteRepository.deleteById(paciente.getId());
    }
}
