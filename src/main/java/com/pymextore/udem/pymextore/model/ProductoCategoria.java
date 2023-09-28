package com.pymextore.udem.pymextore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products_categories")
public class ProductoCategoria {
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Producto producto;

    // Getters and setters
}
