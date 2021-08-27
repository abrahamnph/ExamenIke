package com.example.examen.examen.service;

import com.example.examen.examen.model.CalificacionesModel;
import com.example.examen.examen.repository.CalificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CalificacionesService {

    @Autowired
    CalificacionesRepository calificacionesRepository;

    public ArrayList<CalificacionesModel> getRating(){
        return (ArrayList<CalificacionesModel>) calificacionesRepository.findAll();
    }

    public CalificacionesModel saveRating(CalificacionesModel calificacionesModel){
        return calificacionesRepository.save(calificacionesModel);
    }

    public boolean deleteRating(Long id){
        try{
            calificacionesRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
