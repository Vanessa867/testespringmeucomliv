package com.comlivteste.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comlivteste.demo.model.ClubsModel;
import com.comlivteste.demo.repository.IClubsRepository;

@Service
public class ClubsService {
    
    @Autowired
    private IClubsRepository clubsRepository;

    public ClubsModel instClubsModel(ClubsModel clubs){
        clubsRepository.save(clubs);
        return clubs;
    }
     public List<ClubsModel> getAllClubs(){
        return clubsRepository.findAll();
    }
     public ClubsModel getClubById(Long id){
        ClubsModel clubes = clubsRepository.findById(id).get();
        return clubes;
    }
      public ClubsModel updateClub(ClubsModel clubs) {
        if (clubsRepository.existsById(clubs.getId())) {
            return clubsRepository.save(clubs);
        }
        return null;
    }
}
