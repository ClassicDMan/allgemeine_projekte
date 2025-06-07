
package com.hyand.learning.blog_server.service;

import com.hyand.learning.blog_server.model.Article;
import com.hyand.learning.blog_server.repository.ArticleDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleDAO dao;

    public ArticleService(ArticleDAO dao) {
        this.dao = dao;
    }

    public Optional<Article> createArticle(String title, String content) {
        if (title == null || title.isBlank() || content == null || content.isBlank()) {
            return Optional.empty();
        }
        Article article = new Article(title, content);
        dao.save(article);
        System.out.println("Neuer Artikel hinzugefügt: ID=" + article.getId());
        return Optional.of(article);
    }

    public List<Article> getAllArticles() {
        return dao.findAll();
    }

    public Optional<Article> getArticleById(long id) {
        return dao.findById(id);
    }

    public boolean deleteArticle(long id) {
        return dao.deleteById(id);
    }

    public Optional<Article> updateArticle(long id, String title, String content) {
        Optional<Article> existing = dao.findById(id);
        if (existing.isEmpty() || title == null || title.isBlank() || content == null || content.isBlank()) {
            return Optional.empty();
        }
        Article article = existing.get();
        article.setTitle(title);
        article.setContent(content);
        dao.update(article);
        return Optional.of(article);
    }
}