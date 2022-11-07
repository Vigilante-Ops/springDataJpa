package com.springdatajpa.springboot.controllers;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController
{

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/byname")
    public Product getProductByName(@RequestParam String name)
    {
      return productRepository.findByName(name);

    }
    @GetMapping("/bynamendesc")
    public Product getProductByNameandDes(@RequestParam String name,@RequestParam String description)
    {
        return productRepository.findByNameAndDescription(name,description);

    }
    @GetMapping("/gthan")
    public List<Product> getProductByPriceGreaterThan(@RequestParam int price)
    {
        return productRepository.findByPriceGreaterThan(new BigDecimal(price));

    }

    @GetMapping("/lthan")
    public List<Product> getProductByPriceLesserThan(@RequestParam BigDecimal price)
    {
        return productRepository.findByPriceLessThan(price);

    }
    @GetMapping("/ncontaining")
    public List<Product> getProductByNameContaining(@RequestParam String name)
    {
        return productRepository.findByNameContaining(name);

    }
    @GetMapping("/pricebw")
    public List<Product> getProductBetweenPrice(@RequestParam BigDecimal sprice,@RequestParam BigDecimal eprice)
    {
        return productRepository.findByPriceBetween(sprice,eprice);

    }
    @GetMapping("/date")
    public List<Product> getProductBetweenDates(@RequestParam String start,@RequestParam String end)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime sDate = LocalDateTime.parse(start, formatter);
        LocalDateTime eDate = LocalDateTime.parse(end, formatter);
        return productRepository.findByDateCreatedBetween(sDate,eDate);

    }
    @GetMapping("/queryn")
    public Product getProductQuery(@RequestParam String name,@RequestParam Long id)
    {
        return productRepository.byNameQuery(name,id);

    }
    @GetMapping("/querynaming")
    public Product getProductNamingQuery(@RequestParam String name,@RequestParam Long id)
    {
        return productRepository.byNameQuerynaming(name,id);

    }

    @GetMapping("/native")
    public Product nativeQ(@RequestParam String name)
    {
        return productRepository.nativeQuery(name);

    }
}
