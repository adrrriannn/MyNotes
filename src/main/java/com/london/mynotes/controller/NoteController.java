package com.london.mynotes.controller;

/**
 *
public class NoteController {
 * @author adrián
 */
import com.london.mynotes.domain.Note;
import com.london.mynotes.service.NoteService;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/note")
public class NoteController {
    
    @Autowired
    private NoteService noteService;
    
    /*@InitBinder
    public void InitBinder(WebDataBinder binder){
        
    }*/
    
    @RequestMapping(value= "/create", method = RequestMethod.POST)
    public Note create(@RequestBody Note note){
        return noteService.save(note);
    }
    
}
