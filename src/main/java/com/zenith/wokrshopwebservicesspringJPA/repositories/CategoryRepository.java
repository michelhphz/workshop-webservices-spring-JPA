package com.zenith.wokrshopwebservicesspringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.wokrshopwebservicesspringJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}