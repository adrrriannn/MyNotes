/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.controller;

import com.london.mynotes.domain.PlaceType;
import com.london.mynotes.dto.PlaceTypeDTO;
import com.london.mynotes.service.PlaceTypeService;
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
@RequestMapping("/placeType")
public class PlaceTypeController {
    
    @Autowired
    private PlaceTypeService placeTypeService;
    
    /*@InitBinder
    public void InitBinder(WebDataBinder binder){
        
    }*/
    
    @RequestMapping(value= "/createPlaceType", method = RequestMethod.POST)
    public PlaceTypeDTO createPlaceType(@RequestBody PlaceType placeType){
        return placeTypeService.save(placeType);
    }
    
    @RequestMapping(value= "/getPlaceType", method = RequestMethod.GET)
    public PlaceTypeDTO getNote(@RequestBody Long id){
        return placeTypeService.findOne(id);
    }
    
    @RequestMapping(value = "/deletePlaceType", method = RequestMethod.GET)
    public void deleteNote(@RequestBody Long id){
        placeTypeService.delete(id);
    }
   
    /*
    @RequestMapping(value = "/deletePlaceType", method = RequestMethod.POST)
    public void deleteNote(@RequestBody Note note){
        noteService.delete(note);
    }*/
    
}