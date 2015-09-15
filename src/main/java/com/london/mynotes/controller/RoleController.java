/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.controller;

import com.london.mynotes.domain.Role;
import com.london.mynotes.dto.RoleDTO;
import com.london.mynotes.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adrián
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    
    @Autowired
    private RoleService roleService;
    
    @RequestMapping(value= "/create", method = RequestMethod.POST)
    public RoleDTO createRole(@RequestBody Role role){
        return roleService.save(role);
    }
    
    @RequestMapping(value= "/get", method = RequestMethod.GET)
    public RoleDTO getRole(@RequestBody Long id){
        return roleService.findOne(id);
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void deleteRole(@RequestBody Long id){
        roleService.delete(id);
    }
}
