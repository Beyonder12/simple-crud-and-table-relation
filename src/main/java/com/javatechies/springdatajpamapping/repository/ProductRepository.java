package com.javatechies.springdatajpamapping.repository;

import com.javatechies.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
