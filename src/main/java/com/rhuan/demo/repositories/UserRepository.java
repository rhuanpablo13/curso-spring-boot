package com.rhuan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhuan.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
