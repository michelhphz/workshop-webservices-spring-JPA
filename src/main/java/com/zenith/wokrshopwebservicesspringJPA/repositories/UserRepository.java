package com.zenith.wokrshopwebservicesspringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.wokrshopwebservicesspringJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}