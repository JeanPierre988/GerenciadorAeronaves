package com.sonda.GerenciadorAeronaves.controller;


import com.sonda.GerenciadorAeronaves.model.QntdPorMarcas;
import com.sonda.GerenciadorAeronaves.model.QntdPorSemana;
import com.sonda.GerenciadorAeronaves.repository.AeronaveRepositorio;
import com.sonda.GerenciadorAeronaves.model.Aeronave;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aeronaves") //

public class AeronaveControlador {

    @Autowired //Injeção de dependencias automaticas
    AeronaveRepositorio aeronaveRepositorio;

    @ApiOperation(value = "Lista todas as Aeronaves")
    @GetMapping
    public List<Aeronave> getAllAeronaves(){
        return aeronaveRepositorio.findAll();
    }

    @GetMapping("/marcas-total")
    public List<QntdPorMarcas> getMarcasTotal(){
        return aeronaveRepositorio.countTotalMarcas();
    }

    /*@GetMapping("/semana-total")
    public List<QntdPorSemana> getSemanaTotal(){
        return aeronaveRepositorio.countTotalSemana();
    }*/

    @ApiOperation(value = "Busca pelo ID")
    @GetMapping("/{id}")
    public Optional<Aeronave> getAeronavePeloId(@PathVariable(value = "id") Long id){
        return aeronaveRepositorio.findById(id);
    }

    @PostMapping //CREATE
    public Aeronave addAeronave(@RequestBody Aeronave aeronave){
        aeronave.setCriado(LocalDateTime.now());
        aeronave.setAtualizado(LocalDateTime.now());
        return aeronaveRepositorio.save(aeronave);
    }

    @PutMapping("/{id}") //UPDATE
    public Aeronave updateAeronave(@PathVariable(value = "id") Long id, @RequestBody Aeronave aeronaveDetails){
        Optional<Aeronave> aeronave = aeronaveRepositorio.findById(id);
        Aeronave novaAeronave = aeronave.get();
        novaAeronave.setNome(aeronaveDetails.getNome());
        novaAeronave.setMarca(aeronaveDetails.getMarca());
        novaAeronave.setAno(aeronaveDetails.getAno());
        novaAeronave.setDescricao(aeronaveDetails.getDescricao());
        novaAeronave.setVendido(aeronaveDetails.isVendido());
        novaAeronave.setAtualizado(LocalDateTime.now());

        return aeronaveRepositorio.save(novaAeronave);
    }

    @DeleteMapping("/{id}") //DELETE
    public void deleteAeronave(@PathVariable(value = "id") Long id){
        Optional<Aeronave> aeronave = aeronaveRepositorio.findById(id);
        Aeronave novaAeronave = aeronave.get();
        aeronaveRepositorio.delete(novaAeronave);
    }

//    @GetMapping
}
