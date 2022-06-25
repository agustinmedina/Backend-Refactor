package com.example.java11CRUD.controller;


import java.util.List;
import com.example.java11CRUD.model.Educacion;
import com.example.java11CRUD.service.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/educacion")
@Controller
public class EducacionController {

    @Autowired
    private final EducacionService educacionService;

    public EducacionController (EducacionService educacionService){
        this.educacionService = educacionService;
    }
    /*
    @PutMapping("/update")
    public ResponseEntity <Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
    */
    @PutMapping("/update/{id}")
    public Educacion educacion (@RequestBody Educacion educacion,@PathVariable Long id){
        Educacion educacionActual = educacionService.buscarEducacion(id);
        educacionActual.setTituloEdu(educacion.getTituloEdu());
        educacionActual.setDescEdu(educacion.getDescEdu());
        educacionActual.setFechaEdu(educacion.getFechaEdu());

        return educacionService.addEducation(educacionActual);

    }

    @GetMapping("/all")
    public ResponseEntity <List <Educacion>> obtenerEducacion(){
        List<Educacion> educaciones = educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion (@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionService.addEducation(educacion);
        return new ResponseEntity<> (nuevaEducacion,HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?>borrarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Y con esto podemos integrar el MVC con la parte de acceso a datos que es Spring JPA repository.
    

    
    
}
