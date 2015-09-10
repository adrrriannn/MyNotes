package com.london.mynotes.service;

/**
 *
 * @author adrián
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.Note;
import com.london.mynotes.repository.NoteRepository;
import java.util.List;

@Service
@Transactional
public class NoteService {
    
    @Autowired
    private NoteRepository noteRepository;
    
    public List<Note> findAll(){
        return noteRepository.findAll();
    }
    
    public Note findOne(Long id){
        return noteRepository.findOne(id);
    }
    
    public Note save(Note note){
        return noteRepository.save(note);
    }
    
    public void delete(Long id){
        noteRepository.delete(id);
    }    
   
}
