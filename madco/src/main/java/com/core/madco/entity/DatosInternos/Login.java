package com.core.madco.entity.DatosInternos;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "login")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Login implements Serializable {

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String contra;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}


