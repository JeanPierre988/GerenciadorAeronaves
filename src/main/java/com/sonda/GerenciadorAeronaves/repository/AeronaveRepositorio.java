package com.sonda.GerenciadorAeronaves.repository;

import com.sonda.GerenciadorAeronaves.model.Aeronave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeronaveRepositorio extends JpaRepository<Aeronave, Long> {
    Integer countDistinctMarca();
}
