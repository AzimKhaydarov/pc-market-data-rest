package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.Category;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    String getDescription();
    Attachment getAttachment();
    Double getPrice();
    Category getCategory();
    boolean isActive();
}
