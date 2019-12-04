package com.core.madco.entity.Administracion;

//Esto lo ocupa ComprasController
public class ComprasDCI {

    private Integer producto;

    private Integer cantidad;

    private Integer total;

    private Integer cliente;

    //--> Controller
    public ComprasDCI(Integer producto, Integer cantidad, Integer total, Integer cliente) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        this.cliente = cliente;
    }
    public ComprasDCI() {
    }

    //--> Getters & Setters
    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }
}
