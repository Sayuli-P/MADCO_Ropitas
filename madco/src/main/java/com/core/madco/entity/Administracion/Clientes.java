package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "clientes")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Clientes implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String direccion;

    @Column(columnDefinition ="VARCHAR(10)", nullable = false)
    private String telefono; //valadacion con ayuda de asci  //Properties of, that limiten a 10 numeros

    //* Generate > click derecho > Constructor || geter and seter */
    //--> Aqui empiezan los constructores /* En el construtor no ocupamos el identificador UDLongX */
    public Clientes(String nombre, String apellidos, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Clientes(Long id, String nombre, String apellidos, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Clientes() {
    }

    //--> Aqui empieza (metodo??) geters and seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
