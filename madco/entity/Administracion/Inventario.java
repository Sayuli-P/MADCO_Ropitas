package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "inventario")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Inventario implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproducto;

    @Column(nullable = false)
    private String nombre_producto;

    @Column(nullable = false)
    private Number costo_proveedor;

    @Column(nullable = false)
    private Number costo_producto;

    @Column(nullable = false)
    private Number stock;
}
