package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.User;
import com.example.pcmarketdatarest.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list_info",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
