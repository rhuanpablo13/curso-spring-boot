package com.rhuan.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rhuan.demo.entities.User;
import com.rhuan.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "rhuan pablo", "rhuan@email.com", "99999999", "123465");
		User u2 = new User(null, "maria da silva", "maria@email.com", "99999999", "123465");
		User u3 = new User(null, "joão pedro", "joao@email.com", "99999999", "123465");
		User u4 = new User(null, "beatriz sousa", "beatriz@email.com", "99999999", "123465");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
	}
}
