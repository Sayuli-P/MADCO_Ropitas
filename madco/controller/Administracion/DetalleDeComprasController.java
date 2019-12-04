package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.DetalleDeCompras;
import com.core.madco.service.Administracion.DetalleDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/DetalleDeCompras")
public class DetalleDeComprasController {

    @Autowired
    @Qualifier("DetalleDeComprasService")
    private DetalleDeComprasService service;

    @GetMapping("/name")
    public List<DetalleDeCompras> getByNombre(){
        return service.getByNombre("damian");
    }

    @PostMapping("/new")
    public boolean createUser(){
        DetalleDeCompras r = new DetalleDeCompras();
        r.setCostototal(334);
        r.setFechadecompra(System.currentTimeMillis());
        r.setCantidad_de_productos(34);
        return service.createDetalleDeCompras(r);   //Sin esto el nuevo registro nunca se va a crear
    }

}