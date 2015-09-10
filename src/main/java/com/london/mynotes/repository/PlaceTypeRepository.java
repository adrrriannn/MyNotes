package com.london.mynotes.repository;

/**
 *
 * @author adrián
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.london.mynotes.domain.PlaceType;

public interface PlaceTypeRepository extends JpaRepository<PlaceType, Long>{
    
}
