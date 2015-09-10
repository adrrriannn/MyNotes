package com.london.mynotes.service;

/**
 *
 * @author adrián
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.PlaceType;
import com.london.mynotes.repository.PlaceTypeRepository;

import java.util.List;

@Service
@Transactional
public class PlaceTypeService {
    
    @Autowired
    private PlaceTypeRepository placeTypeRepository;
    
    public List<PlaceType> findAll(){
        return placeTypeRepository.findAll();
    }
    
    public PlaceType findOne(Long id){
        return placeTypeRepository.findOne(id);
    }
    
    public PlaceType save(PlaceType placeType){
        return placeTypeRepository.save(placeType);
    }
    
    public void delete(Long id){
        placeTypeRepository.delete(id);
    }
    
    public void delete(PlaceType placeType){
        placeTypeRepository.delete(placeType);
    }
}
