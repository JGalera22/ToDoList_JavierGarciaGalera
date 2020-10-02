package com.salesianos.edu.ToDoList.repositorio;

import com.salesianos.edu.ToDoList.modelos.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio
        extends JpaRepository<Tarea, Long> {
}
