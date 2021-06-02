package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.District;
import com.example.pcmarketdatarest.projection.CustomDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "district", collectionResourceRel = "list_info",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
