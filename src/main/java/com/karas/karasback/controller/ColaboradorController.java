package com.karas.karasback.controller;

import java.util.List;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.karas.karasback.model.Colaborador;
import com.karas.karasback.repository.ColaboradorRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/colaboradores")
@AllArgsConstructor
public class ColaboradorController {

    private ColaboradorRepository colaboradorRepository;

    @GetMapping
    List<Colaborador> list() {
        return colaboradorRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Colaborador create(@RequestBody Colaborador colaborador) {
        return colaboradorRepository.save(colaborador);
    }

}
