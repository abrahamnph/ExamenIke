package com.example.examen.examen.controller;

import com.example.examen.examen.model.AlumnoModel;
import com.example.examen.examen.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> getStudents(){
        return alumnoService.getStudents();
    }

    @PostMapping()
    public AlumnoModel saveStudent(@RequestBody AlumnoModel alumnoModel){
        return this.alumnoService.saveStudent(alumnoModel);
    }
}
