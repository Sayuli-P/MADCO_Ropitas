package com.core.madco.example;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "peliculas")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity
public class peliculas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pelicula;

    @Column
    private Long idFuncion;

    public peliculas(Long id, String pelicula, Long idFuncion) {
        this.id = id;
        this.pelicula = pelicula;
        this.idFuncion = idFuncion;
    }

    public peliculas(String pelicula, Long idFuncion) {
        this.pelicula = pelicula;
        this.idFuncion = idFuncion;
    }

    public peliculas(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Long getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Long idFuncion) {
        this.idFuncion = idFuncion;
    }
}
