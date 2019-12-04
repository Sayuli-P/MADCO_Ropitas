package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.Compras;
import com.core.madco.projections.DDCinvProjection;
import com.core.madco.repository.Administracion.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

//--> declarar la clase
@Service("ComprasService")     /*Indica que es un servicio */
public class ComprasService {

    @Autowired  /* Inyecta codigo */
    @Qualifier("ComprasRepository")  /* Enlazar hacia el repositorio */
    private ComprasRepository repository;

    public int getVenta(int producto, int cantidad, Timestamp fecha, int total, int cliente){
        return repository.getDDCinvProjection(producto,cantidad, fecha,total,cliente);
    }

    /*
    public int getVenta(int producto, int cantidad, int total, int cliente){
        return repository.getDDCinvProjection(1,2,3,4);
    }*/
}