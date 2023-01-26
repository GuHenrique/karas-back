package com.karas.karasback.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
