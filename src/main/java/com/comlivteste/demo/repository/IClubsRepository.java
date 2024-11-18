package com.comlivteste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comlivteste.demo.model.ClubsModel;

@Repository
public interface IClubsRepository extends JpaRepository<ClubsModel, Long>{
}
