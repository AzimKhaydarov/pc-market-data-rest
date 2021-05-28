package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.OrderList;
import com.example.pcmarketdatarest.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Payment.class)
public interface CustomPayment extends JpaRepository<Payment,Integer> {
    Integer getId();
    String getInvoiceNumber();
    OrderList getOrderList();

}
