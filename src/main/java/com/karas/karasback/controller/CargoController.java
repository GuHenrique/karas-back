package com.karas.karasback.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.karas.karasback.model.Cargo;
import com.karas.karasback.repository.CargoRepository;
import com.karas.karasback.repository.EmpresaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cargos")
@AllArgsConstructor
public class CargoController {

    private CargoRepository cargoRepository;

    @GetMapping
    public List<Cargo> list() {
        return cargoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cargo create(@RequestBody Cargo cargo) {
        return cargoRepository.save(cargo);
    }
}
