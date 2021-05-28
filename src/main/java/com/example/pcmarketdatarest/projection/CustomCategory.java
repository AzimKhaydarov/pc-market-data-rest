package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory extends JpaRepository<Category, Integer> {
    Integer getId();
    String getName();
}
