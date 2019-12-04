package com.core.madco.controller.DatosInternos;

import com.core.madco.entity.Administracion.DetalleDeCompras;
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

    @GetMapping("/get")
    public List<ProductosInternos> getAllPi(){
        return service.getAllPi();
    }
}