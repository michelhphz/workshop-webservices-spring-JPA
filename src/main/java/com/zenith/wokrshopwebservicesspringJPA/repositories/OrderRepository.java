package com.zenith.wokrshopwebservicesspringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.wokrshopwebservicesspringJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}