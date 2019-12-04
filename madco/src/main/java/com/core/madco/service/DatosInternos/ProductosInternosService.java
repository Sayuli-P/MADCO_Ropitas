/*Tercero*/
package com.core.madco.service.DatosInternos;

import com.core.madco.entity.DatosInternos.ProductosInternos;
import com.core.madco.repository.DatosInternos.ProductosInternosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//--> declarar la clase
@Service("ProductosInternosService")     /*Indica que es un servicio */
public class ProductosInternosService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("ProductosInternosRepository")  /* Enlazar hacia el repositorio */
    private ProductosInternosRepository repository;

    //--> GET
    public List<ProductosInternos> getAllPi(){
        return repository.getAllPi();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
        }                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> POST
    public boolean singup(ProductosInternos nombrepi){
        if(!repository.existsByNombrepi(nombrepi.getNombrepi())){
            //l.setPassword(Coder.hashPassword(l.getPassword()));
            if(repository.save(nombrepi) != null){
                return true;
            }
            return false;
        }
        return false;
    }

    //--> DELETE
    public boolean deleteNombrepi(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    //--> UPDATE
    public boolean updateUser(Long id, ProductosInternos ProductosInternos){
        ProductosInternos result = repository.findById(id).get();
        if(result != null){
            result.setNombrepi(ProductosInternos.getNombrepi());
            result.setCosto(ProductosInternos.getCosto());
            result.setStock(ProductosInternos.getStock());
            result.setFechadecomprapi(ProductosInternos.getFechadecomprapi());
            repository.save(result);
            return true;
        }
        return false;
    }
}


/*El parametro solo se ocupa cuando necesite un dato especifico*/