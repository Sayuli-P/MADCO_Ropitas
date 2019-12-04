package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "clientes")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Clientes implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono; //valadacion con ayuda de asci


    //Properties of, that limiten a 10 numeros
}
