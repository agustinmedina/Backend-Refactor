package com.example.java11CRUD.repository;

import com.example.java11CRUD.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
