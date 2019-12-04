/* Cuarto */
package com.core.madco.controller.Administracion;

import com.core.madco.entity.Administracion.Clientes;
import com.core.madco.service.Administracion.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesCotroller {

    @Autowired
    @Qualifier("ClientesService")
    private ClientesService service;

    /* Se necesitan enviar y recibir los datos */
    /* RECIBIR-SELECT: id_pi (automatico) -- nombre_pi -- costo -- fecha_de_compra_pi -- stock */

    //--> GET VER TODOS LOS CLIENTES
    @GetMapping("/get")
    public List<Clientes> getClientes(){
        return service.getClientes();
    }

    //--> POST
    @PostMapping("/post/json")
    public boolean createJson(@RequestBody @Valid Clientes telefono){
        return service.singup(telefono);
    }

    //--> DELETE
    @DeleteMapping("/delete/{id}")
    public boolean deleteNombre(@PathVariable("id") Long id){
        return service.deleteNombre(id);
    }

    //--> UPDATE
    @PutMapping("/update/{id}")
    public boolean updateNombre(  @PathVariable("id") Long id,
                                          @RequestBody @Valid Clientes nombre){
        return service.updateUser(id,nombre);
    }
}
