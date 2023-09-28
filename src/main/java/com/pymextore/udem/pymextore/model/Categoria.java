package com.pymextore.udem.pymextore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name")
    private String categoryName;

    // Getters and setters
}
