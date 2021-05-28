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
public class Product {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "name is mandatory!")
    @UniqueElements(message = "name is unique!")
    private String name;
    private String description;
    private double price;
    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment attachment;
    private boolean inStock;


}
