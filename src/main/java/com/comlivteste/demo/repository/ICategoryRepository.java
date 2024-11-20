package com.comlivteste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comlivteste.demo.model.CategoryModel;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryModel, Long>{
    
}
