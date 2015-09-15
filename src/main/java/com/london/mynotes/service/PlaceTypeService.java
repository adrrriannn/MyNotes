package com.london.mynotes.service;

/**
 *
 * @author adrián
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.PlaceType;
import com.london.mynotes.dto.PlaceTypeDTO;
import com.london.mynotes.repository.PlaceTypeRepository;
import com.london.mynotes.transformer.PlaceTypeTransformer;

import java.util.List;

@Service
@Transactional
public class PlaceTypeService {
    
    @Autowired
    private PlaceTypeRepository placeTypeRepository;
    
    @Autowired
    private PlaceTypeTransformer placeTypeTransformer;
    
    public List<PlaceTypeDTO> findAll(){
        return placeTypeTransformer.entityListToDtoList(placeTypeRepository.findAll());
    }
    
    public PlaceTypeDTO findOne(Long id){
        return placeTypeTransformer.entityToDto(placeTypeRepository.findOne(id));
    }
    
    public PlaceTypeDTO save(PlaceType placeType){
        return placeTypeTransformer.entityToDto(placeTypeRepository.save(placeType));
    }
    
    public void delete(Long id){
        placeTypeRepository.delete(id);
    }
    
    public void delete(PlaceType placeType){
        placeTypeRepository.delete(placeType);
    }
}
