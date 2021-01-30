package com.ctic.prueba.controller;

import com.ctic.prueba.dao.IUsuParq;
import com.ctic.prueba.models.User;
import com.ctic.prueba.models.UserParq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuparq")
public class UsuParqController {

    @Autowired
    IUsuParq usuParq;

    @GetMapping("")
    public List<UserParq> listar(){
        return usuParq.findAll();
    }
    @GetMapping("/{id}")
    public Optional<UserParq> buscar(@PathVariable("id") int id){
        return usuParq.findById(id);
    }
    @PostMapping()
    public UserParq guardar(@RequestBody UserParq userParq){
        usuParq.save(userParq);
        return userParq;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") int id){
        usuParq.deleteById(id);
    }

    @GetMapping("/datos")
    public List<UserParq> datato(){
        return usuParq.datato();
    }
}
