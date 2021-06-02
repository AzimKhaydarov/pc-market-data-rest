package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.OutputProduct;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Set<Product> getProduct();
    Integer getAmount();
}
