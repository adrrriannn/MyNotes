package com.london.mynotes.repository;

/**
 *
 * @author adrián
 */

import com.london.mynotes.domain.Note;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long>{
    
}
