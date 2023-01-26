package com.karas.karasback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karas.karasback.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // O Spring Data JPA possui interfaces que facilitam a conexão com o banco de
    // dados, nesse caso usamos a interface JpaRepository, no generics é necessário
    // passar duas informações. A entidade do banco e o tipo de dados da chave
    // primária.

}
