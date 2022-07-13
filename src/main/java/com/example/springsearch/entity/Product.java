package com.example.springsearch.entity;

import com.example.springsearch.entity.enums.ProductStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String gender;
    private String color;
    private String size;
    private double price;
    private LocalDateTime createdAt;
    private int status;
}
