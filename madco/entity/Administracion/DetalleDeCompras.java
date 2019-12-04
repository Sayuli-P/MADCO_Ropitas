package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "detalledecompras")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class DetalleDeCompras implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddetalledecompras;

    @Column(nullable = false)
    private Number costototal;

    @Column(name = "fecha_de_compra" , nullable = false)    //Es como se llamara la columna
    private Long fechadecompra;                    //Es para llamar a la columna  //checar

    @Column(nullable = false)
    private Number cantidad_de_productos;

    @Column(nullable = false)
    private Long id_clientes;

    @Column(nullable = false)
    private Long id_producto;

//generate set&get       //para que funcione el controlador

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIddetalledecompras() {
        return iddetalledecompras;
    }

    public void setIddetalledecompras(Long iddetalledecompras) {
        this.iddetalledecompras = iddetalledecompras;
    }

    public Number getCostototal() {
        return costototal;
    }

    public void setCostototal(Number costototal) {
        this.costototal = costototal;
    }

    public Long getFechadecompra() {
        return fechadecompra;
    }

    public void setFechadecompra(long fechadecompra) {
        this.fechadecompra = fechadecompra;
    }

    public Number getCantidad_de_productos() {
        return cantidad_de_productos;
    }

    public void setCantidad_de_productos(Number cantidad_de_productos) {
        this.cantidad_de_productos = cantidad_de_productos;
    }

    public Long getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(Long id_clientes) {
        this.id_clientes = id_clientes;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }
}
