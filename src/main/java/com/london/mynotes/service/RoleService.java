package com.london.mynotes.service;

/**
 *
 * @author adrián
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.Role;
import com.london.mynotes.repository.RoleRepository;

import java.util.List;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
            
    public List<Role> findAll(){
        return roleRepository.findAll();
    }
    
    public Role findOne(Long id){
        return roleRepository.findOne(id);
    }
    
    public Role save(Role role){
        return roleRepository.save(role);
    }
    
    public void delete(Long id){
        roleRepository.delete(id);
    }
    
    public void delete(Role role){
        roleRepository.delete(role);
    }
}
