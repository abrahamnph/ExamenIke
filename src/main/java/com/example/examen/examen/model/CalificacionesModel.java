package com.example.examen.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ratings")
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",unique = true, nullable = false)
    private Long id;
    @Column(name = "id_student")
    private Long id_student;
    @Column(name = "id_matter")
    private int id_matter;
    @Column(name = "score")
    private double score;
}
