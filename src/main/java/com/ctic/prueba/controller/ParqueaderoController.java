package com.ctic.prueba.controller;

import com.ctic.prueba.dao.IParq;
import com.ctic.prueba.models.Parqueadero;
import com.ctic.prueba.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parqueadero")
public class ParqueaderoController {
    @Autowired
    IParq iParq;

    @GetMapping("")
    public List<Parqueadero> listar(){
        return iParq.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Parqueadero> buscar(@PathVariable("id") int id){
        return iParq.findById(id);
    }

    @PostMapping("")
    public Parqueadero guardar(@RequestBody Parqueadero parqueadero){
        iParq.save(parqueadero);
        return parqueadero;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") int id){
        iParq.deleteById(id);
    }

    @GetMapping("/total")
    public int total(){
        int count = iParq.totalPar();
        return count;
    }
    @GetMapping("/totalOcup")
    public int totalOcup(){
        int count = iParq.totalParOc();
        return count;
    }
    @GetMapping("/totallibre")
    public List<Parqueadero> totalLibre(){
        iParq.totalLib();
        return iParq.totalLib();
    }


}
