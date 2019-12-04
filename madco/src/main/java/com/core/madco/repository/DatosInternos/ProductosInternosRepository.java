/*Segundo*/
package com.core.madco.repository.DatosInternos;

import com.core.madco.entity.DatosInternos.ProductosInternos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("ProductosInternosRepository")
public interface ProductosInternosRepository extends JpaRepository<ProductosInternos, Serializable> { //Siempre extender a JPA e importar <tabla y serializable>

    //--> Para metodo get
    @Query(value = "SELECT id,stock,nombrepi,costo,fechadecomprapi FROM productosinternos", nativeQuery = true)
    public abstract List<ProductosInternos> getAllPi();  /* Cuando quiera encontrar repositorios por hora accedo aeste metodo */
    //public abstract List<PiDTO> findByHora;  /* Cuando quiera encontrar repositorios por hora accedo aeste metodo */

    //--> Para metodo post
    public abstract boolean existsByNombrepi(String nombrepi);  //bueno analizado super mejoradoxD comprado con el LoginRepository /* Si logre esto puedo lograr todo lo que quiera en mi vida */
    //public boolean existsByNombre_pi(ProductosInternos nombre_pi);  //bueno mejoradoxD
    //public boolean existsByNombre_pi(ProductosInternos nombre_pi); //bueno
    //public String existsByNombre_pi(ProductosInternos nombre_pi); //casi bueno
    //public abstract String ProductosInternos String; save(ProductosInternos nombre_pi);  //malo
}


















