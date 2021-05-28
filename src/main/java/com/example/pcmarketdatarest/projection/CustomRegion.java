package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Region.class)
public interface CustomRegion extends JpaRepository<Region, Integer> {
    Integer getId();
    String getName();
}
