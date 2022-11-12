package com.springdatajpa.springboot.controllers;
import com.springdatajpa.springboot.entity.Order;
import com.springdatajpa.springboot.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order/v1")
public class OrderController
{
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order)
    {

        return orderRepository.save(order);
    }
    @GetMapping("/update")
    public void updateOrder(@RequestParam("id") Long id)
    {

      Order order= orderRepository.findById(id).get();
      order.setStatus("delievered");
      orderRepository.save(order);

    }

}
