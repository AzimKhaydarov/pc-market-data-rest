package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.District;
import com.example.pcmarketdatarest.entity.Region;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    Region getRegion();

}
