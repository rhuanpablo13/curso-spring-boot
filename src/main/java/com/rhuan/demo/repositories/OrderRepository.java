package com.rhuan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhuan.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
