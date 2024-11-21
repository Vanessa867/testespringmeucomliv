package com.comlivteste.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comlivteste.demo.model.UserModel;
import com.comlivteste.demo.repository.IUserRepository;

@Service
public class UserService {
    
    @Autowired
    private IUserRepository userRepository;

    public UserModel insertUser(UserModel user){
        userRepository.save(user);
        return user;
    }

    public UserModel findById(Long id){
        Optional<UserModel> resultUser = userRepository.findById(id);

        if (resultUser.isPresent()) {
            return resultUser.get();
        }
        return null;
    }

}
