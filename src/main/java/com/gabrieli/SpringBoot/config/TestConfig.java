package com.gabrieli.SpringBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabrieli.SpringBoot.entities.User;
import com.gabrieli.SpringBoot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Isabel", "mabe@hotmail.com", "900000000", "mabe12334");
		User u2 = new User(null, "Diogo Rodrigues", "Diogo.r@gmail.com", "98888888888", "bolsonaroLover123");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
