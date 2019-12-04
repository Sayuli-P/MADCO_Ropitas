package com.core.madco.entity.DatosInternos;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "productos_internos")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class ProductosInternos implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpi;

    @Column(nullable = false)
    private String nombre_pi;

    @Column(nullable = false)
    private Number costo;

    @Column(nullable = false)                               //Esto crea la columna
    private Number stock;

    @Column(name = "fecha_de_compra_pi" , nullable = false)
    private LocalDateTime FechadeCompra;                    //Es para llamar a la columna
}
