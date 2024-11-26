package com.comlivteste.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comlivteste.demo.model.UserModel;
import com.comlivteste.demo.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/novoUsuario")
    public UserModel createNeweUser(@RequestBody UserModel user){
        return userService.insertUser(user);
    }

    @GetMapping("/buscarUsuarios")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/busca/{id}")
    public UserModel buscaId(@PathVariable Long id){
        return userService.findById(id);
    }
    
    @PutMapping("/atualiza/{id}")
    public ResponseEntity<UserModel> updateuser(@PathVariable Long id, @RequestBody UserModel entity) {
        UserModel updatedUser = userService.updateUser(entity);
        return ResponseEntity.ok(updatedUser);
    }
    
    @DeleteMapping("/deletar/{id}")
    public void deleteUser(Long id){
        try {
            userService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
