package com.example.java11CRUD.repository;

import com.example.java11CRUD.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
