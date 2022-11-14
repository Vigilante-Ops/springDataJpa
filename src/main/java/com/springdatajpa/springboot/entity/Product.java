package com.springdatajpa.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NamedQuery(name = "Product.findXP",query = "select p from Product p where name=?1")
@NamedNativeQuery(name = "Product.findYP",query ="select * from products where product_name=?1",resultClass = Product.class)
@Table(name = "products",
        schema = "ecommerce",
        uniqueConstraints = {
        @UniqueConstraint(name = "sku_unique",columnNames = "sku")

        }
)
public class Product
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String sku;
@Column(name = "productName",nullable = false)
private String name;
private String description;
private BigDecimal price;
private boolean active;
private String imageUrl;
@CreationTimestamp
private LocalDateTime dateCreated;
@UpdateTimestamp
private LocalDateTime lastUpdated;




}
