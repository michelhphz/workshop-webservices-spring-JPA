package com.zenith.wokrshopwebservicesspringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.wokrshopwebservicesspringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}