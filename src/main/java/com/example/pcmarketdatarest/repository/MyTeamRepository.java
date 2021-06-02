package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.MyTeam;
import com.example.pcmarketdatarest.projection.CustomMyTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "my-team", collectionResourceRel = "list_info",excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {

}
