/* Segundo */
package com.core.madco.repository.Administracion;
import com.core.madco.entity.Administracion.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("ClientesRepository")
public interface ClientesRepository extends JpaRepository<Clientes, Serializable> { //Siempre extender a JPA e importar <tabla y serializable>
    //--> GET  VER TODOS LOS CLIENTES
    @Query(value = "SELECT id,nombre,apellidos,direccion,telefono FROM clientes", nativeQuery = true)
    public abstract List<Clientes> getClientes();

    //--> GET  VER EL NOMBRE DEL CLIENTE PARA REGISTRAR MASCOTA !!!No funciona me dice algo de los apellidos
    //supuse tiene que ver con lo de que el id tembian deve aparecer asi que por eso no lo intente solucionar
    //@Query(value = "SELECT id,nombre FROM clientes", nativeQuery = true)
    //public abstract List<Clientes> getNombreclientes();

    //--> POST
    public abstract boolean existsByTelefono(String telefono);
}

