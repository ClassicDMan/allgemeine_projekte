package com.hyand.learning.backend.controller;

import com.hyand.learning.backend.model.dto.LogTO;
import com.hyand.learning.backend.service.LoggingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
@Slf4j
public class LogController {

    @Autowired
    private LoggingService loggingService;

    @PostMapping("/errors")
    public void logFrontendError(@RequestBody LogTO entry) {
        System.out.println("Log empfangen im Controller: " + entry);
        loggingService.log(entry);
    }

    // 🆕 Neue Methode zum Testen aller Log-Level
    @PostMapping("/demo")
    public void logDemoLevels() {
        loggingService.demoLogLevels();
    }

    @GetMapping("/simulate/{status}")
    public void simulateError(@PathVariable int status) {
        LogTO entry = new LogTO();
        entry.setStatus(status);
        loggingService.log(entry);

    }

}



/*
    @GetMapping("/{status}")
    public ResponseEntity<String> simulateError(@PathVariable int status) {
        return ResponseEntity.status(status).body("Simulierter Fehler " + status);
    }
*/



