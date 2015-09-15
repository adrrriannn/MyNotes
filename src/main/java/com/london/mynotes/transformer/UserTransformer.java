/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.transformer;

import com.london.mynotes.domain.User;
import com.london.mynotes.dto.UserDTO;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrián
 */

@Component
public class UserTransformer implements Transformer<User, UserDTO>{

    @Override
    public User dtoToEntity(UserDTO dto) {
        User user = new User();
      
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setAvatar(dto.getAvatar());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());
        
        return user;
    }

    @Override
    public UserDTO entityToDto(User entity) {
        UserDTO userDto = new UserDTO();
      
        userDto.setId(entity.getId());
        userDto.setUsername(entity.getUsername());
        userDto.setPassword(entity.getPassword());
        userDto.setAvatar(entity.getAvatar());
        userDto.setEmail(entity.getEmail());
        userDto.setRole(entity.getRole());
        
        return userDto;
    }

    @Override
    public List<User> dtoListToEntityList(List<UserDTO> dtoList) {        
        List<User> listUser = new LinkedList<User>();
        
        for(UserDTO userDto: dtoList){
            User user = dtoToEntity(userDto);
            
            listUser.add(user);
        }
        
        return listUser;
    }

    @Override
    public List<UserDTO> entityListToDtoList(List<User> entityList) {        
        List<UserDTO> listUserDto = new LinkedList<UserDTO>();
        
        for(User user: entityList){
            UserDTO userDto = entityToDto(user);
            
            listUserDto.add(userDto);
        }
        
        return listUserDto;
    }
}
    

