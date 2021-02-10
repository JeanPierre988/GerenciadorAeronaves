package com.sonda.GerenciadorAeronaves.repository;

import com.sonda.GerenciadorAeronaves.model.Aeronave;
import com.sonda.GerenciadorAeronaves.model.QntdPorMarcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AeronaveRepositorio extends JpaRepository<Aeronave, Long> {
    @Query(value="SELECT new com.sonda.GerenciadorAeronaves.model.QntdPorMarcas(marca, COUNT(marca)) FROM Aeronave GROUP BY marca ORDER BY COUNT(marca) DESC")
    List<QntdPorMarcas> countTotalMarcas();


}
