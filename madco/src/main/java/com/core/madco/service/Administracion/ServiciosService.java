package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.Servicios;
import com.core.madco.repository.Administracion.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiciosService")     /*Indica que es un servicio */
public class ServiciosService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("ServiciosRepository")  /* Enlazar hacia el repositorio */
    private ServiciosRepository repository;

    //--> GET VER TODOS LOS CLIENTES
    public List<Servicios> getServicios(){
        return repository.getServicios();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
    }                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> POST
    public boolean singup(Servicios id){
        if(!repository.existsById(id.getId())){
            //l.setPassword(Coder.hashPassword(l.getPassword()));
            if(repository.save(id) != null){
                return true;
            }
            return false;
        }
        return false;
    }

    //--> DELETE
    public boolean deleteId(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    //--> UPDATE
    public boolean updateUser(Long id, Servicios Servicios){
        Servicios result = repository.findById(id).get();
        if(result != null){
            result.setTiposervicio(Servicios.getTiposervicio());
            result.setCosto(Servicios.getCosto());
            result.setDescripcionentrada(Servicios.getDescripcionentrada());
            result.setDescripcionsalida(Servicios.getDescripcionsalida());
            result.setDescripcionentrada(Servicios.getDescripcionentrada());
            result.setDescripcionsalida(Servicios.getDescripcionsalida());
            result.setPeso(Servicios.getPeso());
            result.setCorte(Servicios.getCorte());
            result.setPreciodeservicio(Servicios.getPreciodeservicio());
            result.setIdmascotas(Servicios.getIdmascotas());
            repository.save(result);
            return true;
        }
        return false;
    }
}
