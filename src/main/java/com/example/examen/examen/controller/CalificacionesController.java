package com.example.examen.examen.controller;

import com.example.examen.examen.model.CalificacionesModel;
import com.example.examen.examen.repository.CalificacionesRepository;
import com.example.examen.examen.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rating")
public class CalificacionesController {

    @Autowired
    CalificacionesService calificacionesService;

    @GetMapping
    public ArrayList<CalificacionesModel> getRating(){return calificacionesService.getRating();}

    @PostMapping
    public CalificacionesModel saveRating(@RequestBody CalificacionesModel calificacionesModel){
        return  this.calificacionesService.saveRating(calificacionesModel);
    }

    @PutMapping
    public CalificacionesModel updaterating(@RequestBody CalificacionesModel calificacionesModel){
        return  this.calificacionesService.saveRating(calificacionesModel);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteRating(@PathVariable("id") Long id){
        boolean isDelete = this.calificacionesService.deleteRating(id);
        if(isDelete)
            return "Se elimino la calificacion con id: " + id;
        else
            return "No se pudo eliminar la calificacion con id: " + id;
    }
}
