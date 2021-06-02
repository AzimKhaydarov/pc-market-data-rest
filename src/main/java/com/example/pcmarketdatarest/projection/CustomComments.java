package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Comments;
import com.example.pcmarketdatarest.entity.Product;
import com.example.pcmarketdatarest.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Comments.class)
public interface CustomComments {
    Integer getId();
    String getBody();
    Integer getNumberStar();
    User getUser();
    Product getProduct();
}
