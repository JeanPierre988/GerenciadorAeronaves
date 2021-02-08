package com.sonda.GerenciadorAeronaves.controller;


import com.sonda.GerenciadorAeronaves.repository.AeronaveRepositorio;
import com.sonda.GerenciadorAeronaves.model.Aeronave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aeronaves") //

public class AeronaveControlador {
    @Autowired //Injeção de dependencias automaticas
    AeronaveRepositorio aeronaveRepositorio;

    @GetMapping //sem findAll/getAll (padrao)
    public List<Aeronave> getAllAeronaves(){
        return aeronaveRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Aeronave> getAeronavePeloId(@PathVariable(value = "id") Long id){
        return aeronaveRepositorio.findById(id);
    }

    @PostMapping
    public Aeronave addAeronave(@RequestBody Aeronave aeronave){
        return aeronaveRepositorio.save(aeronave);
    }

    @PutMapping("/{id}")
    public Aeronave updateAeronave(@PathVariable(value = "id") Long id, @RequestBody Aeronave aeronaveDetails){
        Optional<Aeronave> aeronave = aeronaveRepositorio.findById(id);
        Aeronave novaAeronave = aeronave.get();
        novaAeronave.setNome(aeronaveDetails.getNome());
        novaAeronave.setMarca(aeronaveDetails.getMarca());
        novaAeronave.setAno(aeronaveDetails.getAno());
        novaAeronave.setDescricao(aeronaveDetails.getDescricao());
        novaAeronave.setVendido(aeronaveDetails.isVendido());
        novaAeronave.setCriado(aeronaveDetails.getCriado());
        novaAeronave.setAtualizado(aeronaveDetails.getAtualizado());

        return aeronaveRepositorio.save(novaAeronave);
    }

    @DeleteMapping("/{id}")
    public void deleteAeronave(@PathVariable(value = "id") Long id){
        Optional<Aeronave> aeronave = aeronaveRepositorio.findById(id);
        Aeronave novaAeronave = aeronave.get();
        aeronaveRepositorio.delete(novaAeronave);
    }

//    @GetMapping
}
