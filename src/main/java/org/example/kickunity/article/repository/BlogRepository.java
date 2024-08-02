package org.example.kickunity.article.repository;

import org.example.kickunity.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
