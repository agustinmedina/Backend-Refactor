package com.example.java11CRUD.service;
import java.util.List;
import javax.transaction.Transactional;

import com.example.java11CRUD.model.Usuario;
import com.example.java11CRUD.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class UsuarioService {

    @Autowired
    private final UsuarioRepo usuarioRepo;


    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
          
    public Usuario addUser (Usuario usuario){
        //return usuarioRepo.save(usuario);
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario (){
      return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
      return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
      usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElse(null);
        //return usuarioRepo.findAll();
      }
    
}
