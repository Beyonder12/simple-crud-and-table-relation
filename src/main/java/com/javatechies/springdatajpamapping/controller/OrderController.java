package com.javatechies.springdatajpamapping.controller;

import com.javatechies.springdatajpamapping.dto.OrderRequest;
import com.javatechies.springdatajpamapping.dto.OrderResponse;
import com.javatechies.springdatajpamapping.entity.Customer;
import com.javatechies.springdatajpamapping.repository.CustomerRepository;
import com.javatechies.springdatajpamapping.repository.ProductRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getInfo() {
        return customerRepository.getJoinInformation();
    }

}
