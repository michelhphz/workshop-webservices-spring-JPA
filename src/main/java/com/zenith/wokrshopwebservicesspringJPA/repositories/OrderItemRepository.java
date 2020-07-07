package com.zenith.wokrshopwebservicesspringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.wokrshopwebservicesspringJPA.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}