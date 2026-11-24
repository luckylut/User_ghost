package com.dt2.ghost.controller;

import com.dt2.ghost.entities.User;
import com.dt2.ghost.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ghost")
public class GhostController {

    private final UserRepository repository;
    public GhostController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping
    public String criar(@RequestBody User u){
        return "User Calvo" + repository.save(u);
    }

    @GetMapping
    public List<User> buscar(){
        return repository.findAll();
    }
}
