package com.springdatajpa.springboot;

import com.springdatajpa.springboot.entity.Address;
import com.springdatajpa.springboot.entity.Order;
import com.springdatajpa.springboot.entity.OrderItem;
import com.springdatajpa.springboot.repository.OrderRepository;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringdatajpacourseApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Test
	void contextLoads() {

	}

}
