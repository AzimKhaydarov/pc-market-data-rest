package com.example.pcmarketdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String home, street;
    @ManyToOne
    private District district;
}
