package com.core.madco.projections;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface DDCinvProjection {

    //Compras
    public String getCostototal();
    public LocalDateTime getFechadecompra();
    public Long getIdclientes();

    //detalle de compras
    public Long getId();
    public Integer getCantidaddeproductos();
    public Integer getPreciodecompra();
    public Long getIdcompra();
    public Long getIdproducto();

    //Inventario
    public String getNombreproducto();
    public Integer getCostoproveedor();
    public Integer getCostoproducto();
    public Integer getStock();
}
