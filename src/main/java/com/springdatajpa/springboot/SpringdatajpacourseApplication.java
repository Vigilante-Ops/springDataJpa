package com.springdatajpa.springboot;

import com.springdatajpa.springboot.entity.*;
import com.springdatajpa.springboot.repository.OrderRepository;
import com.springdatajpa.springboot.repository.ProductRepository;
import com.springdatajpa.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatajpacourseApplication implements CommandLineRunner
{

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpacourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		/*Below code for save and update
		Product product=new Product();
		product.setId(1L);
		product.setName("Apple");
		product.setActive(true);
		product.setPrice(new BigDecimal(500));
		product.setSku("SkuTestmod5");
		product.setImageUrl("imgurl");
		product.setDescription("this is gaming laptop");
		productRepository.save(product);//save uses persist in new entity and in update call it uses merge entity mgr method
    */



		/*Find by id
		Product p=productRepository.findById(1L).get();
		System.out.println(p);*/



		//Save all

/*

		Product product=new Product();
		product.setName("Hp victus");
		product.setActive(true);
		product.setPrice(new BigDecimal(100));
		product.setSku("SkuTestmod");
		product.setImageUrl("imgurl");
		product.setDescription("this is gaming laptop");

		Product product2=new Product();
		product2.setName("Dell alienware");
		product2.setActive(true);
		product2.setPrice(new BigDecimal(200));
		product2.setSku("SkuTestmod2");
		product2.setImageUrl("imgurl2");
		product2.setDescription("pentagon");
		productRepository.saveAll(List.of(product,product2));
*/
        /*FindAll
		List<Product> products= productRepository.findAll();
		products.forEach(x-> System.out.println(x));*/


		/*deleteByid
		productRepository.deleteById(4L);*/

		/*delete method
		Product byId = productRepository.findById(5L).get();
		productRepository.delete(byId);*/

       /*deleteAll query
		List<Product> products= productRepository.findAll();
		productRepository.deleteAll(products);*/

		/*count
		System.out.println(productRepository.count());*/

		//System.out.println(productRepository.existsById(8L));


		/*

		OrderItem orderItem1=new OrderItem();
		orderItem1.setPrice(productRepository.findById(1L).get().getPrice());
		orderItem1.setProduct(productRepository.findById(1L).get());
		orderItem1.setQuantity(2);
		orderItem1.setImageUrl("imageurl1");


		OrderItem orderItem2=new OrderItem();
		orderItem2.setPrice(productRepository.findById(2L).get().getPrice());
		orderItem2.setProduct(productRepository.findById(2L).get());
		orderItem2.setQuantity(4);
		orderItem2.setImageUrl("imageurl2");

		Address address=new Address();
		address.setCity("Kanpur");
		address.setCountry("India");
		address.setState("UP");
		address.setStreet("Avas vikas");
		address.setZipCode("201806");


		Order order=new Order();
		order.setBillingAddress(address);
		order.setStatus("delievered");
		order.setTotalQuantity(1);
		order.setTotalPrice(10000);
		order.setOrderTrackingNumber("track-01");
		order.getOrderItems().addAll(List.of(orderItem1,orderItem2));

		orderRepository.save(order);*/


		User user=new User();
		user.setEmail("dixitaman8@gmail.com");
		user.setFirstName("Aman");
		user.setLastName("Dixit");
		user.setPassword("adxt1999");

		Role db=new Role();
		db.setName("DB");

		Role vm=new Role();
		vm.setName("VM");

		user.getRoles().addAll(List.of(vm,db));
		userRepository.save(user);


	}
}
