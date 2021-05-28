package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Category;
import com.example.pcmarketdatarest.entity.Payment;
import com.example.pcmarketdatarest.projection.CustomCategory;
import com.example.pcmarketdatarest.projection.CustomPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment", collectionResourceRel = "list", excerptProjection = CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
