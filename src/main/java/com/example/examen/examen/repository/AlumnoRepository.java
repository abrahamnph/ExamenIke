package com.example.examen.examen.repository;

import com.example.examen.examen.model.AlumnoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends CrudRepository<AlumnoModel, Long> {

}
