package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "servicios")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Servicios implements Serializable {
    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tiposervicio;

    @Column(nullable = false)
    private Integer costo;

    @Column(nullable = false)
    private String descripcionentrada;

    @Column(nullable = false)
    private String descripcionsalida;

    @Column(nullable = false)
    private Integer peso;

    @Column(nullable = false)
    private String corte;

    @Column(nullable = false)
    private Integer preciodeservicio;

    @Column(nullable = false)
    private Long idmascotas;

    public Servicios(String tiposervicio, Integer costo, String descripcionentrada, String descripcionsalida, Integer peso, String corte, Integer preciodeservicio, Long idmascotas) {
        this.tiposervicio = tiposervicio;
        this.costo = costo;
        this.descripcionentrada = descripcionentrada;
        this.descripcionsalida = descripcionsalida;
        this.peso = peso;
        this.corte = corte;
        this.preciodeservicio = preciodeservicio;
        this.idmascotas = idmascotas;
    }
    public Servicios(Long id, String tiposervicio, Integer costo, String descripcionentrada, String descripcionsalida, Integer peso, String corte, Integer preciodeservicio, Long idmascotas) {
        this.id = id;
        this.tiposervicio = tiposervicio;
        this.costo = costo;
        this.descripcionentrada = descripcionentrada;
        this.descripcionsalida = descripcionsalida;
        this.peso = peso;
        this.corte = corte;
        this.preciodeservicio = preciodeservicio;
        this.idmascotas = idmascotas;
    }
    public Servicios() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getDescripcionentrada() {
        return descripcionentrada;
    }

    public void setDescripcionentrada(String descripcionentrada) {
        this.descripcionentrada = descripcionentrada;
    }

    public String getDescripcionsalida() {
        return descripcionsalida;
    }

    public void setDescripcionsalida(String descripcionsalida) {
        this.descripcionsalida = descripcionsalida;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public Integer getPreciodeservicio() {
        return preciodeservicio;
    }

    public void setPreciodeservicio(Integer preciodeservicio) {
        this.preciodeservicio = preciodeservicio;
    }

    public Long getIdmascotas() {
        return idmascotas;
    }

    public void setIdmascotas(Long idmascotas) {
        this.idmascotas = idmascotas;
    }
}

