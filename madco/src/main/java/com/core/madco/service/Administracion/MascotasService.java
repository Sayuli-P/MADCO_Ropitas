package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.Mascotas;
import com.core.madco.projections.MascotasClientesProjection;
import com.core.madco.repository.Administracion.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//--> declarar la clase
@Service("MascotasService")     /*Indica que es un servicio */
public class MascotasService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("MascotasRepository")  /* Enlazar hacia el repositorio */
    private MascotasRepository repository;

    //--> Para hacer el metodo get
    public List<MascotasClientesProjection> getMascli(){
        return repository.getMascli();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
    }                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> Para hacer el metodo post
    public boolean singup(Mascotas nombremascota){
        if(!repository.existsByNombremascota(nombremascota.getNombremascota())){
            //l.setPassword(Coder.hashPassword(l.getPassword()));
            if(repository.save(nombremascota) != null){
                return true;
            }
            return false;
        }
        return false;
    }
}
