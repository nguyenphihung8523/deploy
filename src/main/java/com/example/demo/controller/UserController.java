package com.example.demo.controller;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repo;

    @GetMapping
    public List<UserAccount> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public UserAccount create(@RequestBody UserAccount user) {
        return repo.save(user);
    }
}
