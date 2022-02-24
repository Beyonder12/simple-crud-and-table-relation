package com.javatechies.springdatajpamapping.repository;

import com.javatechies.springdatajpamapping.dto.OrderResponse;
import com.javatechies.springdatajpamapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select new com.javatechies.springdatajpamapping.dto.OrderResponse(c.name, p.productName, p.price) from Customer c join c.products p")
    public List<OrderResponse> getJoinInformation();
}
