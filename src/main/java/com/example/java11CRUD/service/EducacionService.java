package com.example.java11CRUD.service;


import java.util.List;
import javax.transaction.Transactional;
import com.example.java11CRUD.model.Educacion;
import com.example.java11CRUD.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class EducacionService {

    @Autowired
    private final  EducacionRepo educacionRepo;

    public EducacionService (EducacionRepo educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducation (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones (){
        return educacionRepo.findAll();        
    }
    public Educacion editarEducacion (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion (Long id){
        educacionRepo.deleteById(id);
    }

    public Educacion buscarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }
}
