/* 3ro*/
package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.Inventario;
import com.core.madco.repository.Administracion.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

//--> declarar la clase
@Service("InventarioService")     /*Indica que es un servicio */
public class InventarioService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("InventarioRepository")  /* Enlazar hacia el repositorio */
    private InventarioRepository repository;

    //--> GET VER TODOS LOS CLIENTES
    public List<Inventario> getInventario(){
        return repository.getInventario();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
    }                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> POST
    public boolean singup(Inventario nombreproducto){
        if(!repository.existsByNombreproducto(nombreproducto.getNombreproducto())){
            //l.setPassword(Coder.hashPassword(l.getPassword()));
            if(repository.save(nombreproducto) != null){
                return true;
            }
            return false;
        }
        return false;
    }

    //--> DELETE
    public boolean deleteNombreproducto(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    //--> UPDATE
    public boolean updateUser(Long id, Inventario Inventario){
        Inventario result = repository.findById(id).get();
        if(result != null){
            result.setNombreproducto(Inventario.getNombreproducto());
            result.setCostoproveedor(Inventario.getCostoproveedor());
            result.setCostoproducto(Inventario.getCostoproducto());
            result.setStock(Inventario.getStock());
            repository.save(result);
            return true;
        }
        return false;
    }

}
