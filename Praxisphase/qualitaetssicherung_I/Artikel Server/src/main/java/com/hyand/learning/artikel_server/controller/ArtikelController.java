package com.hyand.learning.artikel_server.controller;

import com.hyand.learning.artikel_server.exceptions.ArtikelNotFoundException;
import com.hyand.learning.artikel_server.exceptions.ArtikelTextTooLongException;
import com.hyand.learning.artikel_server.model.dto.ArtikelDTO;
import com.hyand.learning.artikel_server.service.aussensicht.IArtikelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ArtikelController {

    String ss;
    int a;

    private final IArtikelService artikelService;

    @Autowired
    public ArtikelController(IArtikelService artikelService) {
        this.artikelService = artikelService;
    }

    @Operation(summary = "Erstellt einen neuen Artikel")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artikel wurde erfolgreich erstellt"),
            @ApiResponse(responseCode = "400", description = "Ungültige Eingabedaten")
    })









    @PostMapping("/articles")
    public ResponseEntity<String> createArticle(@Valid @RequestBody ArtikelDTO article) {
        int totalLength = (article.getTitle() != null ? article.getTitle().length() : 0) +
                (article.getContent() != null ? article.getContent().length() : 0);

        if (totalLength > 500) {
            throw new ArtikelTextTooLongException("Titel und Inhalt dürfen zusammen höchstens 500 Zeichen haben.");
        }

        artikelService.save(article);

        return ResponseEntity.ok("Artikel erstellt");
    }














    @Operation(summary = "Liefert einen Artikel anhand der ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artikel gefunden"),
            @ApiResponse(responseCode = "404", description = "Artikel nicht gefunden")
    })
    @GetMapping("/articles/{id}")
    public ResponseEntity<ArtikelDTO> getArticle(@PathVariable Long id) {
        Optional<ArtikelDTO> found = artikelService.findById(id);
        if (found.isEmpty()) {
            throw new ArtikelNotFoundException("Artikel mit ID " + id + " wurde nicht gefunden.");
        }
        return ResponseEntity.ok(found.get());
    }
}



