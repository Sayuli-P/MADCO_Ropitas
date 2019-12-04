package com.core.madco.repository.Administracion;

import com.core.madco.entity.Administracion.Compras;
import com.core.madco.projections.DDCinvProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository("ComprasRepository")
public interface ComprasRepository extends JpaRepository<Compras, Serializable> {

    //--> GET

    //--> POST
    //public abstract boolean existsByFechadecompra(LocalDateTime fechadecompra);

    //--> POST real
    //public abstract boolean  existsByFechadecompra(LocalDateTime fechadecompra);
    @Query(value = "SELECT venderproducto( ?1 , ?2 , ?3 , ?4 , ?5)", nativeQuery = true)
    public abstract int getDDCinvProjection(int producto, int cantidad, Timestamp fecha, int total, int cliente);

    //--> POST real
    /*public abstract boolean  existsByFechadecompra(LocalDateTime fechadecompra);
    @Query(value = "SELECT venderproducto( ?1, ?2, ?3, ?4)", nativeQuery = true)
    public abstract int getDDCinvProjection(int producto, int cantidad, int total, int cliente);*/
}
