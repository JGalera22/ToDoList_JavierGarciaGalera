package com.salesianos.edu.ToDoList.servicios;

import com.salesianos.edu.ToDoList.modelos.Tarea;
import com.salesianos.edu.ToDoList.repositorio.TareaRepositorio;
import com.salesianos.edu.ToDoList.servicios.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaServicio extends
        ServicioBaseImpl<Tarea, Long, TareaRepositorio> {

    public List<Tarea> lista() {
        return this.findAll().stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                }).collect(Collectors.toUnmodifiableList());
    }

}
