
package com.portfolio.edp.Repository;

import com.portfolio.edp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonarepository extends JpaRepository<Persona,Long> {
    
}
