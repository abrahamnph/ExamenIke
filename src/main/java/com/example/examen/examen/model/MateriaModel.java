package com.example.examen.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "matter")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MateriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_matter",unique = true, nullable = false)
    private int id_matter;
    @Column(name = "name")
    private String name;
}
