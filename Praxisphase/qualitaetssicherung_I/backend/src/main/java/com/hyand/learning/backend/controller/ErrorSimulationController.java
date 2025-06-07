package com.hyand.learning.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test-error")
public class ErrorSimulationController {

    @GetMapping("/{status}")
    public ResponseEntity<String> simulateError(@PathVariable int status) {
        return ResponseEntity.status(status).body("Simulierter Fehler " + status);
    }
}