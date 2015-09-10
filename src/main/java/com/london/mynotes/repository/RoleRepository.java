package com.london.mynotes.repository;

/**
 *
 * @author adrián
 */
import com.london.mynotes.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
