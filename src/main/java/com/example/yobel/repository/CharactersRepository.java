package com.example.yobel.repository;
import com.example.yobel.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CharactersRepository extends JpaRepository<Characters,Long>{
    
}
