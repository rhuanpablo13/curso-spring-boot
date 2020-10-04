package com.rhuan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhuan.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
