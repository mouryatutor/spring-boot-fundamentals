package com.ratan.springweb.productrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratan.springweb.productrestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
} 