package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Delivery;
import com.example.pcmarketdatarest.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Delivery.class)
public interface CustomDelivery extends JpaRepository<Delivery, Integer> {
    Integer getId();
    String getInvoiceNumber();
    Payment getPayment();
    boolean getAccomplished();
}
