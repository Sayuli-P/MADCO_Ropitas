package com.core.madco.repository.Administracion;

import com.core.madco.entity.Administracion.DetalleDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("DetalleDeComprasRepository")
public interface DetalleDeComprasRepository  extends JpaRepository<DetalleDeCompras, Serializable> {


}





