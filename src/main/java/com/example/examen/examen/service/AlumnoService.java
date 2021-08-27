package com.example.examen.examen.service;

import com.example.examen.examen.model.AlumnoModel;
import com.example.examen.examen.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<AlumnoModel> getStudents(){
       return  (ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }

    public AlumnoModel saveStudent(AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }
}
