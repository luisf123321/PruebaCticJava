package com.ctic.prueba.controller;

import com.ctic.prueba.dao.IUser;
import com.ctic.prueba.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    IUser us;

    @GetMapping
    public List<User> listar(){
        List<User> user = (List<User>) us.findAll();
        return user;
    }

    @GetMapping("/{id}")
    public Optional<User> buscar(@PathVariable("id") Long id){
        return us.findById(id);
    }

    @PostMapping("")
    public User guardar(@RequestBody User user){
        us.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Long id){
        us.deleteById(id);
    }

    @GetMapping("/codigo/{codigo}")
    public User buscarcodigo(@PathVariable ("codigo") Long id){
        return us.buscarCodigo(id);
    }
}
