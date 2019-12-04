package com.core.madco.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PeliculasController {

    @Autowired
    @Qualifier("PeliculasService")
    private PeliculasService service;

    @GetMapping("/peliculas")
    public List<peliculas> getPeliculas(){
        return service.getPeliculas();
    }

    @GetMapping("/peliculasconhora")
    public List<peliculasDTO> getPeliculasConHora(){
        return service.getPeliculasConHora();
    }
}
