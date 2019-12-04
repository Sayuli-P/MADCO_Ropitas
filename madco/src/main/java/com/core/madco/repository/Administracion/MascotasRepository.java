package com.core.madco.repository.Administracion;

import com.core.madco.entity.Administracion.Mascotas;
import com.core.madco.projections.MascotasClientesProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("MascotasRepository")
public interface MascotasRepository extends JpaRepository<Mascotas, Serializable> {

    //--> Para metodo get inner join tabla clientes
    @Query(value = "SELECT nombremascota,tipomascota,raza,sexo,alergias,observacionesgnrls,idclientes,nombre FROM mascotas INNER JOIN clientes ON mascotas.idclientes = clientes.id;", nativeQuery = true)
    public abstract List<MascotasClientesProjection> getMascli();

    //--> Para metodo post
    public abstract boolean existsByNombremascota(String nombremascota);
}