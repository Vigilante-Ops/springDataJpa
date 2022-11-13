package com.springdatajpa.springboot.controllers;
import com.springdatajpa.springboot.entity.Address;
import com.springdatajpa.springboot.entity.Order;
import com.springdatajpa.springboot.repository.AddressRepository;
import com.springdatajpa.springboot.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order/v1")
public class OrderController
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AddressRepository addressRepository;
//@RequestBody Order order
    @PostMapping("/save")
    public void saveAddd(@RequestBody Address recadd)
    {

       /* Order order = new Order();

        order.setOrderTrackingNumber("1000");
        order.setStatus("COMPLETED");
        order.setTotalPrice(3333);
        order.setTotalQuantity(5);

        Address billingAddress = new Address();
        billingAddress.setStreet("kothrud");
        billingAddress.setCity("pune");
        billingAddress.setState("Maharashra");
        billingAddress.setCountry("India");
        billingAddress.setZipCode("11048");
        billingAddress.setOrder(order);
        order.setBillingAddress(billingAddress);

        // save both order and address ( Cascade type - ALL)
        return orderRepository.save(order);*/
        /*
        //saving using master order
        Order receivedorder=order;
        Address address=order.getBillingAddress();
        receivedorder.setBillingAddress(address);
        address.setOrder(receivedorder);
        orderRepository.save(receivedorder);
        */

        System.out.println(recadd);
        Address address=recadd;
        Order order=address.getOrder();
        address.setOrder(order);
        order.setBillingAddress(address);
        addressRepository.save(address);

    }
    @GetMapping("/update")
    public void updateOrder(@RequestParam("id") Long id)
    {

      Order order= orderRepository.findById(id).get();
      order.setStatus("delievered");
      orderRepository.save(order);

    }
    @PostMapping("/findbyadd")
    public void saveOrder(@RequestParam Long id)
    {

        System.out.println(addressRepository.findById(id).get().getOrder());

    }

}
