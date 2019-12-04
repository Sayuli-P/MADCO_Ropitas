package com.core.madco.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("PeliculasRepository")
public interface PeliculasRepository extends JpaRepository<peliculas, Serializable> {

    @Query(value = "SELECT pelicula,hora FROM peliculas INNER JOIN funciones ON peliculas.id_funcion = funciones.id;", nativeQuery = true)
    public abstract List<peliculasDTO> getPeliculasConHora();

}
