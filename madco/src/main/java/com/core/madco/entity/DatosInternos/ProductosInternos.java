/*Primero es la entidad*/
package com.core.madco.entity.DatosInternos;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "productosinternos")                     //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity
public class ProductosInternos implements Serializable{

    private static final long serialVersionUID = 1L;   //LO ocupa hibernate es un Identificador para llamar a repository

    //--> Aqui empiezan las columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;         /* Correcto*/

    @Column(nullable = false)  /* Correcto*/
    private String nombrepi;

    @Column(nullable = false)
    private Integer costo;

    @Column(nullable = false)                               //Esto crea la columna
    private Integer stock;

    @Column(name = "fechadecomprapi", nullable = false)
    @CreationTimestamp
    private LocalDateTime fechadecomprapi;                    //Es para llamar a la columna

    //* Generate > click derecho > Constructor || geter and seter */
    //--> Aqui empiezan los constructores /* En el construtor no ocupamos el identificador UDLongX */
    public ProductosInternos(String nombrepi, Integer costo, Integer stock, LocalDateTime fechadecomprapi) {
        this.nombrepi = nombrepi;
        this.costo = costo;
        this.stock = stock;
        this.fechadecomprapi = fechadecomprapi;
    }

    public ProductosInternos(Long id, String nombrepi, Integer costo, Integer stock, LocalDateTime fechadecomprapi) {
        this.id = id;
        this.nombrepi = nombrepi;
        this.costo = costo;
        this.stock = stock;
        this.fechadecomprapi = fechadecomprapi;
    }

    public ProductosInternos() {
    }

    //--> Aqui empieza (metodo??) geters and seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrepi() {
        return nombrepi;
    }

    public void setNombrepi(String nombrepi) {
        this.nombrepi = nombrepi;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDateTime getFechadecomprapi() {
        return fechadecomprapi;
    }

    public void setFechadecomprapi(LocalDateTime fechadecomprapi) {
        this.fechadecomprapi = fechadecomprapi;
    }
}
