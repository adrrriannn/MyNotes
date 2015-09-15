/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.transformer;

import com.london.mynotes.domain.PlaceType;
import com.london.mynotes.dto.PlaceTypeDTO;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrián
 */
@Component
public class PlaceTypeTransformer implements Transformer<PlaceType,PlaceTypeDTO>{

    @Override
    public PlaceType dtoToEntity(PlaceTypeDTO dto) {
        
        PlaceType placeType = new PlaceType();        
        
        placeType.setId(dto.getId());
        placeType.setName(dto.getName());
        placeType.setDescription(dto.getDescription());
        
        return placeType;
    }

    @Override
    public PlaceTypeDTO entityToDto(PlaceType entity) {
        
        PlaceTypeDTO placeTypeDto = new PlaceTypeDTO();        
        
        placeTypeDto.setId(entity.getId());       
        placeTypeDto.setDescription(entity.getDescription());
        placeTypeDto.setName(entity.getName());
        
        return placeTypeDto;
    }

    @Override
    public List<PlaceType> dtoListToEntityList(List<PlaceTypeDTO> dtoList) {
        
        List<PlaceType> listPlaceType = new LinkedList<PlaceType>();
        
        for(PlaceTypeDTO placeTypeDTO: dtoList){
            PlaceType placeType = dtoToEntity(placeTypeDTO);
            listPlaceType.add(placeType);
        }
        
        return listPlaceType;
    }

    @Override
    public List<PlaceTypeDTO> entityListToDtoList(List<PlaceType> entityList) {
        
        List<PlaceTypeDTO> listPlaceTypeDTO = new LinkedList<PlaceTypeDTO>();
        
        for(PlaceType placeType: entityList){
            PlaceTypeDTO placeTypeDto = entityToDto(placeType);
            listPlaceTypeDTO.add(placeTypeDto);            
        }
        
        return listPlaceTypeDTO;
    }       
}
