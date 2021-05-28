package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Feedback.class)
public interface CustomFeedback extends JpaRepository<Feedback, Integer> {
    Integer getId();
    String getTitle();
}
