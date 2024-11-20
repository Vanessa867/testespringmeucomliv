package com.comlivteste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comlivteste.demo.model.MeetingModel;

@Repository
public interface IMeetingRepository extends JpaRepository<MeetingModel, Long>{
    
}
