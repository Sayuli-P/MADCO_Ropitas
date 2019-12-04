/* 2do */
package com.core.madco.repository.Administracion;

import com.core.madco.entity.Administracion.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("InventarioRepository")
public interface InventarioRepository extends JpaRepository<Inventario, Serializable> {
    //--> GET  VER TODOS LOS PRODUCTOS DEL INVENTARIO
    @Query(value = "SELECT id,nombreproducto,costoproveedor,costoproducto,stock FROM inventario", nativeQuery = true)
    public abstract List<Inventario> getInventario();
    //List<Inventario> findNombreproducto();

    //--> POST
    public abstract boolean existsByNombreproducto(String nombreproducto);

    //Delete y Update en el service

}