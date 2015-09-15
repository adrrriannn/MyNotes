package com.london.mynotes.transformer;

import com.london.mynotes.domain.Role;
import com.london.mynotes.dto.RoleDTO;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrián
 */

@Component
public class RoleTransformer implements Transformer<Role,RoleDTO> {

    @Override
    public Role dtoToEntity(RoleDTO dto) {
        Role role = new Role();
        
        role.setId(dto.getId());    
        role.setRoleName(dto.getRolename());
        
        return role;
    }

    @Override
    public RoleDTO entityToDto(Role entity) {
        RoleDTO roleDto = new RoleDTO();
        
        roleDto.setId(entity.getId());
        roleDto.setRolename(entity.getRoleName());
        
        return roleDto;
    }

    @Override
    public List<Role> dtoListToEntityList(List<RoleDTO> dtoList) {
        List<Role> listRole = new LinkedList<Role>();
        
        for(RoleDTO roleDto: dtoList){
            Role role = dtoToEntity(roleDto);
            
            listRole.add(role);
        }
        
        return listRole;
    }

    @Override
    public List<RoleDTO> entityListToDtoList(List<Role> entityList) {
        List<RoleDTO> listRole = new LinkedList<RoleDTO>();
        
        for(Role role: entityList){
            RoleDTO roleDto = entityToDto(role);
            
            listRole.add(roleDto);
        }
        
        return listRole;
    }
    
    
    
}
