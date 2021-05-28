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
public class AttachmentContent {
    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "name is mandatory!")
    private byte[] bytes ;
    @OneToOne
    private Attachment attachment;
}
