package com.rhuan.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rhuan.demo.entities.Order;
import com.rhuan.demo.entities.User;
import com.rhuan.demo.repositories.OrderRepository;
import com.rhuan.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "rhuan pablo", "rhuan@email.com", "99999999", "123465");
		User u2 = new User(null, "maria da silva", "maria@email.com", "99999999", "123465");
		User u3 = new User(null, "joão pedro", "joao@email.com", "99999999", "123465");
		User u4 = new User(null, "beatriz sousa", "beatriz@email.com", "99999999", "123465");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
		
		Order o1 = new Order(null, u1, Instant.parse("2020-01-15T19:53:07Z"));
		Order o2 = new Order(null, u1, Instant.parse("2020-04-10T20:53:07Z"));
		Order o3 = new Order(null, u2, Instant.parse("2020-05-12T09:00:00Z"));
		Order o4 = new Order(null, u3, Instant.parse("2020-05-17T12:30:08Z"));
		Order o5 = new Order(null, u4, Instant.parse("2020-06-22T18:15:07Z"));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));
	}
}
