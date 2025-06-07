package com.hyand.learning.blog_server.repository;

import com.hyand.learning.blog_server.model.Article;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ArticleDAO {

    @PersistenceContext
    private EntityManager em;

    public Article save(Article article) {
        em.persist(article);
        return article;
    }

    public Optional<Article> findById(Long id) {

        return Optional.ofNullable(em.find(Article.class, id));
    }

    public List<Article> findAll() {
        Query query = em.createQuery("FROM Article");
        return query.getResultList();
    }

    public Article update(Article article) {

        return em.merge(article);
    }

    public boolean deleteById(Long id) {
        Article article = em.find(Article.class, id);
        if (article != null) {
            em.remove(article);
            return true;
        }
        return false;
    }
}
