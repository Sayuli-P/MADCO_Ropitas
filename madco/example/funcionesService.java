package com.core.madco.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("funcionesService")
public class funcionesService {

    @Autowired
    @Qualifier("funcionesRepository")
    private funcionesRepository repository;

    public List<funciones> getFunciones() {
        return repository.findAll(); /*método establecido*/
    }

    public List<funciones> getFuncionesPorHora(String hora){
        return repository.findByHora(hora);
    }

}
