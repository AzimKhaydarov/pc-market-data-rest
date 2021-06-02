package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Order;
import com.example.pcmarketdatarest.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order", collectionResourceRel = "list_info",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
