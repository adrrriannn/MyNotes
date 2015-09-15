package com.london.mynotes.service;

/**
 *
 * @author adrián
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.london.mynotes.domain.Note;
import com.london.mynotes.dto.NoteDTO;
import com.london.mynotes.repository.NoteRepository;
import com.london.mynotes.transformer.NoteTransformer;
import java.util.List;

@Service
@Transactional
public class NoteService {
    
    @Autowired
    private NoteRepository noteRepository;
    
    @Autowired
    private NoteTransformer noteTransformer;
    
    public List<NoteDTO> findAll(){
        return noteTransformer.entityListToDtoList(noteRepository.findAll());
    }
    
    public NoteDTO findOne(Long id){
        return noteTransformer.entityToDto(noteRepository.findOne(id));
    }
    
    public NoteDTO save(Note note){
        return noteTransformer.entityToDto(noteRepository.save(note));
    }
    
    public void delete(Long id){
        noteRepository.delete(id);
    }    
   
}
