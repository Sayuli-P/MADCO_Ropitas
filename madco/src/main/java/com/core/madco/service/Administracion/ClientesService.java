/* Tercero */
package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.Clientes;
import com.core.madco.repository.Administracion.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//--> declarar la clase
@Service("ClientesService")     /*Indica que es un servicio */
public class ClientesService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("ClientesRepository")  /* Enlazar hacia el repositorio */
    private ClientesRepository repository;

    //--> GET VER TODOS LOS CLIENTES
    public List<Clientes> getClientes(){
        return repository.getClientes();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
    }                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> GET VER EL NOMBRE DEL CLIENTE PARA REGISTRAR MASCOTA !!!No funciona me dice algo de los apellidos
    //public List<Clientes> getNombreclientes(){
    //    return repository.getNombreclientes();     /* FindAll: Este metodo lo tiene el jpa no hay que hacer nada */
    //}                                 /* return repository se ocupa because devualve los datos de la entidad */

    //--> POST
    public boolean singup(Clientes telefono){
        if(!repository.existsByTelefono(telefono.getTelefono())){
            //l.setPassword(Coder.hashPassword(l.getPassword()));
            if(repository.save(telefono) != null){
                return true;
            }
            return false;
        }
        return false;
    }

    //--> DELETE
    public boolean deleteNombre(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    //--> UPDATE
    public boolean updateUser(Long id, Clientes Clientes){
        Clientes result = repository.findById(id).get();
        if(result != null){
            result.setNombre(Clientes.getNombre());
            result.setApellidos(Clientes.getApellidos());
            result.setDireccion(Clientes.getDireccion());
            result.setTelefono(Clientes.getTelefono());
            repository.save(result);
            return true;
        }
        return false;
    }
}
