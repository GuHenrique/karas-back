package com.karas.karasback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karas.karasback.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
