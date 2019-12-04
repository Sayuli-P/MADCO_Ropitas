package com.core.madco.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PeliculasService")
public class PeliculasService {

    @Autowired
    @Qualifier("PeliculasRepository")
    private PeliculasRepository repository;

    public List<peliculas> getPeliculas(){
        return repository.findAll();
    }/*SELECT * FROM peliculas*/

    public List<peliculasDTO> getPeliculasConHora(){
        return repository.getPeliculasConHora();
    }
}
