package com.hyand.learning.blog_server.controller;

import com.hyand.learning.blog_server.model.Article;
import com.hyand.learning.blog_server.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;


@RestController
@RequestMapping("/api/posts")
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Object> createArticle(@RequestBody Map<String, String> payload) {
        String title = payload.get("title");
        String content = payload.get("content");

        return service.createArticle(title, content)
                .<ResponseEntity<Object>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().body("Titel und Inhalt dürfen nicht leer sein."));

    }

    @GetMapping
    public ResponseEntity<Collection<Article>> getAllArticles() {

        return ResponseEntity.ok(service.getAllArticles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticleById(@PathVariable long id) {
        return service.getArticleById(id)
                .<ResponseEntity<Object>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(404).body("Artikel nicht gefunden."));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateArticle(@PathVariable long id, @RequestBody Map<String, String> payload) {
        String title = payload.get("title");
        String content = payload.get("content");

        return service.updateArticle(id, title, content)
                .<ResponseEntity<Object>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().body("Ungültige Eingabedaten oder Artikel nicht gefunden."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArticle(@PathVariable long id) {
        return service.deleteArticle(id)
                ? ResponseEntity.ok("Artikel erfolgreich gelöscht.")
                : ResponseEntity.status(404).body("Artikel nicht gefunden.");
    }
}