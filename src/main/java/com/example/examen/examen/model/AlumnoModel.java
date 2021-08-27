package com.example.examen.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id_student",unique = true, nullable = false)
    private Long id_student;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "motherLastName")
    private String motherLastName;
    @Column(name = "id_matter")
    private int id_matter;
}
