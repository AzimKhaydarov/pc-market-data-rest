package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Feedback;
import com.example.pcmarketdatarest.projection.CustomFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "feedback", collectionResourceRel = "list", excerptProjection = CustomFeedback.class)
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
