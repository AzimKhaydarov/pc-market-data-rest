package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.UserBasket;
import com.example.pcmarketdatarest.projection.CustomUserBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "userBasket", collectionResourceRel = "list_info",excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
