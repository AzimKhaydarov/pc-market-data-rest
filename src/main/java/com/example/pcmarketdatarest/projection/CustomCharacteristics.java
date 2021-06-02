package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Characteristics;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {
    Integer getId();
    String getName();
    Integer getSize();
    Product getProduct();
}
