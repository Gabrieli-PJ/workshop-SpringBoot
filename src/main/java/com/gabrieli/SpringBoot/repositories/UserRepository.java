package com.gabrieli.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieli.SpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
