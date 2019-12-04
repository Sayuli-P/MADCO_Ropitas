package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "mascotas")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Mascotas implements Serializable {

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmascota;

    @Column(nullable = false)
    private String nombre_mascota;

    @Column(nullable = false)
    private String tipo_mascota;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private String sexo;

    @Column
    private String alergias;

    @Column
    private String observaciones_gnrls;

    @Column(nullable = false)
    private Long id_clientes;

}

