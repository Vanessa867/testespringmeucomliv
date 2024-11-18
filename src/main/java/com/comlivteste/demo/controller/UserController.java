package com.comlivteste.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comlivteste.demo.model.UserModel;
import com.comlivteste.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("/novousuario")
    public String createNewUser(@RequestBody UserModel entity) {
        return userService.createNewUser(entity);
    }
    
}
