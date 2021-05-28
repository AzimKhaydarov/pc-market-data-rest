package com.example.pcmarketdatarest.entity;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "name is mandatory!")
    @UniqueElements(message = "name is unique!")
    private String name;
}
