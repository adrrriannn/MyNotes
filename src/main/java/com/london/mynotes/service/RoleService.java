package com.london.mynotes.service;

/**
 *
 * @author adrián
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.Role;
import com.london.mynotes.dto.RoleDTO;
import com.london.mynotes.repository.RoleRepository;
import com.london.mynotes.transformer.RoleTransformer;

import java.util.List;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private RoleTransformer roleTransformer;
            
    public List<RoleDTO> findAll(){
        return roleTransformer.entityListToDtoList(roleRepository.findAll());
    }
    
    public RoleDTO findOne(Long id){
        return roleTransformer.entityToDto(roleRepository.findOne(id));
    }
    
    public RoleDTO save(Role role){
        return roleTransformer.entityToDto(roleRepository.save(role));
    }
    
    public void delete(Long id){
        roleRepository.delete(id);
    }
    
    public void delete(Role role){
        roleRepository.delete(role);
    }
}
