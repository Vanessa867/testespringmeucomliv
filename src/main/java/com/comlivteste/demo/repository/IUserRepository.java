package com.comlivteste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comlivteste.demo.model.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{
}
