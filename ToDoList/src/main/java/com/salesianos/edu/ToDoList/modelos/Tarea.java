package com.salesianos.edu.ToDoList.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor

public class Tarea {
    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private String fechaCreacion;
    private String fechaCaducidad;

}
