package com.core.madco.repository.Administracion;

import com.core.madco.entity.Administracion.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("ServiciosRepository")
public interface ServiciosRepository extends JpaRepository<Servicios, Serializable> {
    //--> GET  VER TODOS LOS PRODUCTOS DEL INVENTARIO
    @Query(value = "SELECT * FROM servicios", nativeQuery = true)
    public abstract List<Servicios> getServicios();

    //--> POST
    public abstract boolean existsById(String id);

    //--> DELETE Y UPDATE en el servicio
}
