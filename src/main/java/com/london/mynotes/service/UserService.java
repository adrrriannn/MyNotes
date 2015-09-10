/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.service;

/**
 *
 * @author adrián
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.User;
import com.london.mynotes.repository.UserRepository;
import java.util.List;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll(){
        return userRepository.findAll();
    }
    
    public User findOne(Long id){
        return userRepository.findOne(id);
    }
            
    public User save(User user){
        return userRepository.save(user);
    }
    
    public void delete(Long id){
        userRepository.delete(id);
    }
    
    public void delete(User user){
        userRepository.delete(user);
    }
}
