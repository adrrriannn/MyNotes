/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.controller;

import com.london.mynotes.domain.User;
import com.london.mynotes.dto.UserDTO;
import com.london.mynotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adrián
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public UserDTO createUser(@RequestBody User user){
        return userService.save(user);
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public UserDTO getUser(@RequestBody Long id){
        return userService.findOne(id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void deleteUser(@RequestBody Long id){
       userService.delete(id);
    }
}
