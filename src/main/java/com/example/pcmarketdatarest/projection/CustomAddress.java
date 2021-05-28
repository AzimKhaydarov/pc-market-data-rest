package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress extends JpaRepository<Address, Integer> {
    Integer getId();
    String getHome();
    String getStreet();
    District getDistrict();

}
