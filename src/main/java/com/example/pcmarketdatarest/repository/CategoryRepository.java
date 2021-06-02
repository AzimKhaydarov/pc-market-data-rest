package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Category;
import com.example.pcmarketdatarest.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="category", collectionResourceRel = "List_info", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
