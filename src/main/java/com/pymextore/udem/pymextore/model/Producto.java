package com.pymextore.udem.pymextore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_descrip")
    private String productDescription;

    @Column(name = "price")
    private Double price;

    // Getters and setters
}
