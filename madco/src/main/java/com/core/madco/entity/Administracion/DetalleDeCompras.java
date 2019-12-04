package com.core.madco.entity.Administracion;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "detalledecompras")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity
public class DetalleDeCompras implements Serializable {

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer cantidaddeproductos;

    @Column(nullable = false)
    private Integer preciodecompra;

    @Column(nullable = false)
    private Long idcompra;

    @Column(nullable = false)
    private Long idproducto;

    //--> Controlador
    public DetalleDeCompras(Integer cantidaddeproductos, Integer preciodecompra, Long idcompra, Long idproducto) {
        this.cantidaddeproductos = cantidaddeproductos;
        this.preciodecompra = preciodecompra;
        this.idcompra = idcompra;
        this.idproducto = idproducto;
    }
    public DetalleDeCompras(Long id, Integer cantidaddeproductos, Integer preciodecompra, Long idcompra, Long idproducto) {
        this.id = id;
        this.cantidaddeproductos = cantidaddeproductos;
        this.preciodecompra = preciodecompra;
        this.idcompra = idcompra;
        this.idproducto = idproducto;
    }
    public DetalleDeCompras() {
    }

    //--> Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidaddeproductos() {
        return cantidaddeproductos;
    }

    public void setCantidaddeproductos(Integer cantidaddeproductos) {
        this.cantidaddeproductos = cantidaddeproductos;
    }

    public Integer getPreciodecompra() {
        return preciodecompra;
    }

    public void setPreciodecompra(Integer preciodecompra) {
        this.preciodecompra = preciodecompra;
    }

    public Long getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Long idcompra) {
        this.idcompra = idcompra;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }
}
