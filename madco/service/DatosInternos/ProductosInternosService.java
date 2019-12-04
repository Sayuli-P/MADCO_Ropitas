/*Primero es el servicio*/
package com.core.madco.service.DatosInternos;

import com.core.madco.entity.DatosInternos.ProductosInternos;
import com.core.madco.repository.DatosInternos.ProductosInternosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/* delcarar la clase*/
@Service("ProductosInternosService")
public class ProductosInternosService {

    /* Enlazar hacia el repositorio*/
    @Autowired
    @Qualifier("ProductosInternosRepository")
    private ProductosInternosRepository repository;

    /* Metodo get*/
    public List<ProductosInternos> getAllPi(){
        return repository.getAllPi();
    }

}



/*El parametro solo se ocupa cuando necesite un dato especifico*/