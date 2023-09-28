package com.pymextore.udem.pymextore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ordersDetails")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Producto producto;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    // Getters and setters
}

