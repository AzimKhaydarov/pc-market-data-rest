package com.example.pcmarketdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "name is mandatory!")
    @UniqueElements(message = "name is unique!")
    private String fullName;
    @NotBlank(message = "phone is mandatory!")
    @UniqueElements(message = "phone is unique!")
    private String phoneNumber;
    @Email
    @NotBlank(message = "e-mail is mandatory!")
    @UniqueElements(message = "e-mail is unique!")
    private String mail;
    @OneToOne
    private Address address;
    @OneToMany
    private List<Feedback> feedbackList;
}
