package com.karas.karasback.controller;

import java.util.List;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.karas.karasback.model.Empresa;
import com.karas.karasback.repository.EmpresaRepository;

import lombok.AllArgsConstructor;

@RestController // fala pro spring que essa classe contem um endponti(url)
@RequestMapping("/api/empresas") // onde passa o endpoint da api, onde nosso front irá buscar as informaçoes
@AllArgsConstructor // anotação do lombok que cria o construtor da classe automaticamente.
public class EmpresaController {

    private EmpresaRepository empresaRepository;

    @GetMapping // fala qual o método será usado no metodo, no caso nesse metodo é o GET
    public List<Empresa> list() {
        return empresaRepository.findAll(); // faz um select * from <nomeDaTabela>
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Empresa create(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
        // System.out.println(empresa.getNomeFantasia());
        // return
        // ResponseEntity.status(HttpStatus.CREATED).body(empresaRepository.save(empresa));

    }

}
