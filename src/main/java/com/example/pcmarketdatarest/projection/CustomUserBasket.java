package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.User;
import com.example.pcmarketdatarest.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {

    Integer getId();
    Double getAllSum();
    User getUser();
}
