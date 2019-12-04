package com.core.madco.entity.Administracion;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "mascotas")                             //Si no ponemos nombre agarra por defecto el nombre de la clase
@Entity

public class Mascotas implements Serializable {

    private static final long serialVersionUID = 1L;     //LO ocupa hibernate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombremascota;

    @Column(nullable = false)
    private String tipomascota;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private String sexo;

    @Column
    private String alergias;

    @Column
    private String observacionesgnrls;

    @Column(nullable = false)
    private Long idclientes;

    //* Generate > click derecho > Constructor || geter and seter */
    //--> Aqui empiezan los constructores /* En el construtor no ocupamos el identificador UDLongX */

    public Mascotas(String nombremascota, String tipomascota, String raza, String sexo, String alergias, String observacionesgnrls, Long idclientes) {
        this.nombremascota = nombremascota;
        this.tipomascota = tipomascota;
        this.raza = raza;
        this.sexo = sexo;
        this.alergias = alergias;
        this.observacionesgnrls = observacionesgnrls;
        this.idclientes = idclientes;
    }
    public Mascotas(Long id, String nombremascota, String tipomascota, String raza, String sexo, String alergias, String observacionesgnrls, Long idclientes) {
        this.id = id;
        this.nombremascota = nombremascota;
        this.tipomascota = tipomascota;
        this.raza = raza;
        this.sexo = sexo;
        this.alergias = alergias;
        this.observacionesgnrls = observacionesgnrls;
        this.idclientes = idclientes;
    }
    public Mascotas() {
    }

    //--> Aqui empieza (metodo??) geters and seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getTipomascota() {
        return tipomascota;
    }

    public void setTipomascota(String tipomascota) {
        this.tipomascota = tipomascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservacionesgnrls() {
        return observacionesgnrls;
    }

    public void setObservacionesgnrls(String observacionesgnrls) {
        this.observacionesgnrls = observacionesgnrls;
    }

    public Long getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Long idclientes) {
        this.idclientes = idclientes;
    }
}

