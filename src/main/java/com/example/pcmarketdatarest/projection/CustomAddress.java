package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.District;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getHomeNumber();
    District getDistrict();

}