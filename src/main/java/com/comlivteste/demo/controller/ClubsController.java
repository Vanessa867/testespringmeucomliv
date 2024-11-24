package com.comlivteste.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comlivteste.demo.model.ClubsModel;
import com.comlivteste.demo.service.ClubsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/comliv/clubs/")
public class ClubsController {
    
    @Autowired
    private ClubsService clubsService;

    @PostMapping("/criarclub")
    public String createclub(@RequestBody ClubsModel entity) {
        return clubsService.instClubsModel(clubs);
    }

    @GetMapping("/buscar")
    public List<ClubsModel> getAllClubs(){
        return clubsService.getAllClubs();
    }
    @GetMapping("/buscar/{id}")
    public ClubsModel Buscapeloid(@PathVariable Long id) {
        return clubsService.getClubById(id);
    }
    
 
    
    
}
