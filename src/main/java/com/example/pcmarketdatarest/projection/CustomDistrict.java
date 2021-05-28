package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.District;
import com.example.pcmarketdatarest.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = District.class)
public interface CustomDistrict extends JpaRepository<District, Integer> {
    Integer getId();
    Region getRegion();
}
