package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public Product findByName(String name);
    public Product findByNameAndDescription(String name,String desc);

    public List<Product> findByPriceGreaterThan(BigDecimal price);

    public List<Product> findByPriceLessThan(BigDecimal price);

    public List<Product> findByNameContaining(String name);
    public List<Product> findByPriceBetween(BigDecimal startPrice,BigDecimal endPrice);
    public List<Product> findByDateCreatedBetween(LocalDateTime sDate, LocalDateTime eDate);
}
