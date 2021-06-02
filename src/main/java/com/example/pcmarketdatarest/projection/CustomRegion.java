package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Region;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getName();
}
