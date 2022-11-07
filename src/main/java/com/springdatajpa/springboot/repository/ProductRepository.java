package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    @Query("select p from Product p where p.name=?1 and id=?2")
    public Product byNameQuery(String name,Long id);

    @Query("select p from Product p where p.name=:name and id=:idd")
    public Product byNameQuerynaming(@Param("name") String name,@Param("idd") Long id);

    @Query(value = "select * from products where product_name=:name",nativeQuery = true)
    public Product nativeQuery(String name);
}
