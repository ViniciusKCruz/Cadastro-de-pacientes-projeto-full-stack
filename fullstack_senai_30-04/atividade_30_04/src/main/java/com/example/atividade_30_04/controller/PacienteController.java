package com.example.atividade_30_04.controller;

import com.example.atividade_30_04.model.Paciente;
import com.example.atividade_30_04.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> listarTodos(){
        return pacienteService.listarPaciente();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Paciente paciente) {
        pacienteService.salvar(paciente);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Paciente cadastrado com sucesso"));
    }

    @PutMapping
    public ResponseEntity<Map<String, Object>> atualizar(@Valid @RequestBody Paciente paciente) {
        pacienteService.atualizar(paciente);
        return ResponseEntity.ok().body(Map.of("Mensagem", "Os dados do paciente foram atualizados"));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable String email, Paciente paciente) {
        pacienteService.excluir(email);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Conta do paciente excluída"));
    }
}
