package com.example.pcmarketdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Delivery {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String invoiceNumber;
    @OneToOne
    private Payment payment;
    private boolean accomplished;
}
