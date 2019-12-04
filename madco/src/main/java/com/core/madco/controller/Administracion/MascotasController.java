package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.Mascotas;
import com.core.madco.projections.MascotasClientesProjection;
import com.core.madco.service.Administracion.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotasController {

    @Autowired
    @Qualifier("MascotasService")
    private MascotasService service;

    // GET //NO funciona al correr da u  error de conversion de tipo de archivo
    @GetMapping("/get")
    public List<MascotasClientesProjection> getMascli(){
        return service.getMascli();
    }
    // POST
    @PostMapping("/post/json")
    public boolean createJson(@RequestBody @Valid Mascotas nombremascota){
        return service.singup(nombremascota);
    }
}
