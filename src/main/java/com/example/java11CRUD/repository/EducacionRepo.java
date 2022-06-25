package com.example.java11CRUD.repository;

import com.example.java11CRUD.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository <Educacion,Long> {
    
}
