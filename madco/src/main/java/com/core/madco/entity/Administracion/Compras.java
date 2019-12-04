package com.core.madco.entity.Administracion;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "compras")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer costototal;

    @Column(name = "fechadecompra", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechadecompra;                    //Es para llamar a la columna

    @Column(nullable = false)
    private Long idclientes;

    //--> Controlador
    public Compras(Integer costototal, LocalDateTime fechadecompra, Long idclientes) {
        this.costototal = costototal;
        this.fechadecompra = fechadecompra;
        this.idclientes = idclientes;
    }
    public Compras(Long id, Integer costototal, LocalDateTime fechadecompra, Long idclientes) {
        this.id = id;
        this.costototal = costototal;
        this.fechadecompra = fechadecompra;
        this.idclientes = idclientes;
    }
    public Compras() {
    }

    //--> Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCostototal() {
        return costototal;
    }

    public void setCostototal(Integer costototal) {
        this.costototal = costototal;
    }

    public LocalDateTime getFechadecompra() {
        return fechadecompra;
    }

    public void setFechadecompra(LocalDateTime fechadecompra) {
        this.fechadecompra = fechadecompra;
    }

    public Long getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Long idclientes) {
        this.idclientes = idclientes;
    }
}
