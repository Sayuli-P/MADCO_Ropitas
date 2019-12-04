package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "inventario")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Inventario implements Serializable{

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreproducto;

    @Column(nullable = false)
    private Integer costoproveedor;

    @Column(nullable = false)
    private Integer costoproducto;

    @Column(nullable = false)
    private Integer stock;

    //* Generate > click derecho > Constructor || geter and seter */
    //--> Aqui empiezan los constructores /* En el construtor no ocupamos el identificador UDLongX */
    public Inventario(String nombreproducto, Integer costoproveedor, Integer costoproducto, Integer stock) {
        this.nombreproducto = nombreproducto;
        this.costoproveedor = costoproveedor;
        this.costoproducto = costoproducto;
        this.stock = stock;
    }
    public Inventario(Long id, String nombreproducto, Integer costoproveedor, Integer costoproducto, Integer stock) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.costoproveedor = costoproveedor;
        this.costoproducto = costoproducto;
        this.stock = stock;
    }
    public Inventario() {
    }

    //--> Aqui empieza (metodo??) geters and seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Integer getCostoproveedor() {
        return costoproveedor;
    }

    public void setCostoproveedor(Integer costoproveedor) {
        this.costoproveedor = costoproveedor;
    }

    public Integer getCostoproducto() {
        return costoproducto;
    }

    public void setCostoproducto(Integer costoproducto) {
        this.costoproducto = costoproducto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


}
