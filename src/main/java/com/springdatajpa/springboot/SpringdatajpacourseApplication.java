package com.springdatajpa.springboot;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		/*Product product=new Product();
		product.setName("Hp victus");
		product.setActive(true);
		product.setPrice(new BigDecimal(123));
		product.setSku("SkuTestmod");
		product.setImageUrl("imgurl");
		product.setDescription("this is gaming laptop");

		Product product2=new Product();
		product2.setName("Dell alienware");
		product2.setActive(true);
		product2.setPrice(new BigDecimal(123));
		product2.setSku("SkuTestmod2");
		product2.setImageUrl("imgurl2");
		product2.setDescription("pentagon");
		productRepository.saveAll(List.of(product,product2));*/

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





	}
}
