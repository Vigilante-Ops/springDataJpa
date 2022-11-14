package com.springdatajpa.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_items",schema = "ecommerce")
@Setter
@Getter
public class OrderItem
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;


}
