package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Article;
import com.example.pcmarketdatarest.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
