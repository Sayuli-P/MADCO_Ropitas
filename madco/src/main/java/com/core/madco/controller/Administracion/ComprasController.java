package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.Compras;
import com.core.madco.entity.Administracion.ComprasDCI;
import com.core.madco.projections.DDCinvProjection;
import com.core.madco.service.Administracion.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.sql.Timestamp;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    @Qualifier("ComprasService")
    private ComprasService service;

    //--> POST
    @PostMapping("/post/json")
    ////////public int createJson(@RequestBody @Valid CLASE NUEVA ){ return service.getVenta(2,3,5,2); }*/
    public int createJson(@RequestBody @Valid ComprasDCI venta)
    {
        System.out.println("********************************************"+new Timestamp(System.currentTimeMillis()));
        return service.getVenta(venta.getProducto(), venta.getCantidad(), new Timestamp(System.currentTimeMillis()), venta.getTotal(),venta.getCliente());
    }

    /*
    //--> POST
    @PostMapping("/post/json")
    public int createJson(@RequestBody @Valid ComprasDCI producto, ComprasDCI cantidad, ComprasDCI total, ComprasDCI cliente)
    {
        return service.getVenta(4,1,3,4);
    }
    */
}
