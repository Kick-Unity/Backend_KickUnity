package org.example.kickunity.article.dto;

import lombok.Getter;
import org.example.kickunity.article.domain.Article;

@Getter
public class ArticleResponse {
    private String title;
    private String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
