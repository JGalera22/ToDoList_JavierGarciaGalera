package com.salesianos.edu.ToDoList.controladores;

import com.salesianos.edu.ToDoList.modelos.Tarea;
import com.salesianos.edu.ToDoList.servicios.TareaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping("/tarea")
    @RequiredArgsConstructor
    public class controladorTarea {

        private final TareaServicio tareaServicio;


        @GetMapping("/")
        public String list(Model model) {
            model.addAttribute("lista", tareaServicio.lista());
            return "tarea/ListaTareas";
        }

        @GetMapping("/formulario")
        public String nuevaTarea (Model model) {
            model.addAttribute("tarea", new Tarea());
            return "tarea/formulario";
        }

        @PostMapping("/submit")
        public String enviarNuevaTarea(
                @ModelAttribute("tarea") Tarea tarea) {
            tareaServicio.save(tarea);
            return "redirect:/ListaTareas/";
        }
}
