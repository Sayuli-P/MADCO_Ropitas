/*Segundo es el repositorio*/
package com.core.madco.repository.DatosInternos;

import com.core.madco.entity.DatosInternos.ProductosInternos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("ProductosInternosRepository")
public interface ProductosInternosRepository extends JpaRepository<ProductosInternos, Serializable> {

    @Query(value = "SELECT stock,nombre_pi,costo,fecha_de_compra_pi FROM login", nativeQuery = true)
    public abstract List<ProductosInternos> getAllPi();
}
