package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.Feedback;
import com.example.pcmarketdatarest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Users.class)
public interface CustomUsers extends JpaRepository<Users, Integer> {
    Integer getId();
    String getFullName();
    String getPhoneNumber();
    String getMail();
    Address getAddress();
    Feedback getFeedbackList();
}
