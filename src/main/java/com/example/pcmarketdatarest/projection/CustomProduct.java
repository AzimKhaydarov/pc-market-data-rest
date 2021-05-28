package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.Category;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct extends JpaRepository<Product,Integer> {
    Integer getId();
    String getName();
    Category getCategory();
    String getDescription();
    double getPrice();
    boolean getInStock();
    Attachment getAttachment();
}
