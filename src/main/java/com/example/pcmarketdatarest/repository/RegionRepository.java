package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Region;
import com.example.pcmarketdatarest.projection.CustomRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "region", collectionResourceRel = "list", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
