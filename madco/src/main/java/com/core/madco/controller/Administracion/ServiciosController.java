package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.Servicios;
import com.core.madco.service.Administracion.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {

    @Autowired
    @Qualifier("ServiciosService")
    private ServiciosService service;

    // GET VER TODOS LOS SERVICIOS OFRECIDOS
    @GetMapping("/get")
    public List<Servicios> getServicios(){
        return service.getServicios();
    }

    //--> POST
    @PostMapping("/post/json")
    public boolean createJson(@RequestBody @Valid Servicios id){ return service.singup(id);
    }

    //--> DELETE
    @DeleteMapping("delete/{id}")
    public boolean deleteId(@PathVariable("id") Long id){
        return service.deleteId(id);
    }

    //--> UPDATE
    @PutMapping("/update/{id}")
    public boolean updateCosto(  @PathVariable("id") Long id,
                              @RequestBody @Valid Servicios costo){
        return service.updateUser(id, costo);
    }
}
