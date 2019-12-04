/* 4to */
package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.Inventario;
import com.core.madco.service.Administracion.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

@Autowired
@Qualifier("InventarioService")
    private InventarioService service;

    // GET VER TODOS LOS PRODUCTOS INVENRTARIO
    @GetMapping("/get")
    public List<Inventario> getInventario(){
        return service.getInventario();
    }

    //--> POST
    @PostMapping("/post/json")
    public boolean createJson(@RequestBody @Valid Inventario nombreproducto){
        return service.singup(nombreproducto);
    }

    //--> DELETE
    @DeleteMapping("/delete/{id}")
    public boolean deleteNombreproducto(@PathVariable("id") Long id){
        return service.deleteNombreproducto(id);
    }

    //--> UPDATE
    @PutMapping("/update/{id}")
    public boolean updateNombreproducto(  @PathVariable("id") Long id,
                                @RequestBody @Valid Inventario nombreproducto){
        return service.updateUser(id,nombreproducto);
    }
}
