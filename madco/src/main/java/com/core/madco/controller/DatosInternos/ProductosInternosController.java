/*Cuarto*/
package com.core.madco.controller.DatosInternos;

import com.core.madco.entity.DatosInternos.ProductosInternos;
import com.core.madco.service.DatosInternos.ProductosInternosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pi")
public class ProductosInternosController {

    @Autowired
    @Qualifier("ProductosInternosService")
    private ProductosInternosService service;

/* Se necesitan enviar y recibir los datos */
/* RECIBIR-SELECT: id_pi (automatico) -- nombre_pi -- costo -- fecha_de_compra_pi -- stock */

    //--> GET  hice la proyeccion solo para que me muestre los datos especificos que yo quiera
    @GetMapping("/get")
    public List<ProductosInternos> getAllPi(){
        return service.getAllPi();
    }

    //--> POST
    @PostMapping("/post/json")
    public boolean createJson(@RequestBody @Valid ProductosInternos nombrepi){ return service.singup(nombrepi); }

    //--> DELETE
    @DeleteMapping("/delete/{id}")
    public boolean deleteNombrepi(@PathVariable("id") Long id){
        return service.deleteNombrepi(id);
    }

    //--> UPDATE
    @PutMapping("/update/{id}")
    public boolean updateNombrepi(@PathVariable("id") Long id,
                                  @RequestBody @Valid ProductosInternos nombrepi){
        return service.updateUser(id,nombrepi);
    }
}