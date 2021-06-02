package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Order;
import com.example.pcmarketdatarest.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    String getDate();
    UserBasket getUserBasket();
    String getDetails();
}
