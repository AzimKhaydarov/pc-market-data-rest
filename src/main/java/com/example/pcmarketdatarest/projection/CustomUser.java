package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFullName();

    String getEmail();

    Address getAddress();
}
