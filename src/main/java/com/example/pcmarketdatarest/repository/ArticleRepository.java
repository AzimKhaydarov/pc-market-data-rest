package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Article;
import com.example.pcmarketdatarest.projection.CustomArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="article", collectionResourceRel = "list_info", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
