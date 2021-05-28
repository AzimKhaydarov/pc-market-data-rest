package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.OrderList;
import com.example.pcmarketdatarest.projection.CustomOrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "orderList", collectionResourceRel = "list", excerptProjection = CustomOrderList.class)
public interface OrderListRepository extends JpaRepository<OrderList, Integer> {
}
