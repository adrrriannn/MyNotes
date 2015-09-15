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
import com.london.mynotes.dto.UserDTO;
import com.london.mynotes.repository.UserRepository;
import com.london.mynotes.transformer.UserTransformer;
import java.util.List;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserTransformer userTransformer;
    
    public List<UserDTO> findAll(){
        return userTransformer.entityListToDtoList(userRepository.findAll());
    }
    
    public UserDTO findOne(Long id){
        return userTransformer.entityToDto(userRepository.findOne(id));
    }
            
    public UserDTO save(User user){
        return userTransformer.entityToDto(userRepository.save(user));
    }
    
    public void delete(Long id){
        userRepository.delete(id);
    }
    
    public void delete(User user){
        userRepository.delete(user);
    }
}
