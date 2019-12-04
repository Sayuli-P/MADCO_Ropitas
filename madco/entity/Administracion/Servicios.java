package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "servicios")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Servicios implements Serializable {
    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmascota;

    @Column(nullable = false)
    private String tipo_de_servicio;

    @Column(nullable = false)
    private Number costo;

    @Column(nullable = false)
    private String descripcion_de_entrada;

    @Column(nullable = false)
    private String descripcion_de_salida;

    @Column(nullable = false)
    private Number peso;

    @Column(nullable = false)
    private String corte;


    @Column(nullable = false)
    private Number precio_de_servicio;

    @Column(nullable = false)
    private Long id_mascotas;
}
