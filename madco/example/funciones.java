package com.core.madco.example;


import javax.persistence.*;
import java.io.Serializable;

@Table(name = "funciones")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity
public class funciones implements Serializable {

    private static final long serialVersionUID = 1L; /*identificador para llmar desde el repositorio*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String hora;

    public funciones(String hora) {
        this.hora = hora;
    }
    public funciones() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
