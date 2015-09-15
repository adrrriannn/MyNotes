package com.london.mynotes.controller;

/**
 *
public class NoteController {
 * @author adrián
 */
import com.london.mynotes.domain.Note;
import com.london.mynotes.dto.NoteDTO;
import com.london.mynotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {
    
    @Autowired
    private NoteService noteService;
    
    /*@InitBinder
    public void InitBinder(WebDataBinder binder){
        
    }*/
    
    @RequestMapping(value= "/createNote", method = RequestMethod.POST)
    public NoteDTO create(@RequestBody Note note){
        return noteService.save(note);
    }
    
    @RequestMapping(value= "/getNote", method = RequestMethod.GET)
    public NoteDTO getNote(@RequestBody Long id){
        return noteService.findOne(id);
    }
    
    @RequestMapping(value = "/deleteNote", method = RequestMethod.GET)
    public void deleteNote(@RequestBody Long id){
        noteService.delete(id);
    }
   
    /*
    @RequestMapping(value = "/deleteNote", method = RequestMethod.POST)
    public void deleteNote(@RequestBody Note note){
        noteService.delete(note);
    }*/  
}