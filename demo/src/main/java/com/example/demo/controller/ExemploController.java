package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ExemploController {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Ok endpoint acessado");
    }
}
