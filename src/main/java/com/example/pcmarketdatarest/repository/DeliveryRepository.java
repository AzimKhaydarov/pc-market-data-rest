package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Delivery;
import com.example.pcmarketdatarest.projection.CustomDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "delivery", collectionResourceRel = "list", excerptProjection = CustomDelivery.class)
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
