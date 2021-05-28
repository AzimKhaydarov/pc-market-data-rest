package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.OrderList;
import com.example.pcmarketdatarest.entity.Product;
import com.example.pcmarketdatarest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = OrderList.class)
public interface CustomOrderList extends JpaRepository<OrderList, Integer> {
    Integer getId();
   Date getDate();
   String getOrderNumber();
   Product getProduct();
   Integer getQuantity();
   Users getUsers();
}
