/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.transformer;

import com.london.mynotes.domain.Note;
import com.london.mynotes.dto.NoteDTO;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrián
 */
@Component
public class NoteTransformer implements Transformer<Note,NoteDTO> {

    @Override
    public Note dtoToEntity(NoteDTO dto) {
        Note note = new Note();
        
        note.setId(dto.getId());
        note.setName(dto.getName());
        note.setCoordenateX(dto.getCoordenateX());
        note.setCoordenateY(dto.getCoordenateY());
        note.setImage(dto.getImage());
        note.setRating(dto.getRating());
        note.setUserId(dto.getUserId());
        
        return note;
    }

    @Override
    public NoteDTO entityToDto(Note note) {
        NoteDTO dto = new NoteDTO();
        
        dto.setId(note.getId());
        dto.setName(note.getName());
        dto.setCoordenateX(note.getCoordenateX());
        dto.setCoordenateY(note.getCoordenateY());
        dto.setImage(note.getImage());
        dto.setRating(note.getRating());
        dto.setUserId(note.getUserId());
        
        return dto;
    }

    @Override
    public List<Note> dtoListToEntityList(List<NoteDTO> dtoList) {
        List<Note> listNote = new LinkedList<Note>();
        
        for(NoteDTO noteDTO: dtoList){
            Note note = dtoToEntity(noteDTO);
            listNote.add(note);
        }
        
        return listNote;
    }

    @Override
    public List<NoteDTO> entityListToDtoList(List<Note> entityList) {
        List<NoteDTO> listNoteDTO = new LinkedList<NoteDTO>();
        
        for(Note note: entityList){
            NoteDTO noteDTO = entityToDto(note);
            listNoteDTO.add(noteDTO);
        }
        
        return listNoteDTO;
    }
   
}
