package com.core.madco.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/afu")
public class funcionesController {

    @Autowired
    @Qualifier("funcionesService")
    private funcionesService service;

    @GetMapping("/funciones")
    public List<funciones> getFunciones(){
        return service.getFunciones();
    }
    @GetMapping("/funciones/{hora}")
    public List<funciones> getFunciones(@PathVariable("hora") String hora){
        return service.getFuncionesPorHora(hora);
    }
}
