package com.core.madco.service.Administracion;

import com.core.madco.entity.Administracion.DetalleDeCompras;
import com.core.madco.repository.Administracion.DetalleDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("DetalleDeComprasService")
public class DetalleDeComprasService {
    @Autowired
    @Qualifier("DetalleDeComprasRepository")
    private DetalleDeComprasRepository repository;

    public List<DetalleDeCompras> getByNombre(String name){

        return repository.findAll();
    }

    public boolean createDetalleDeCompras(DetalleDeCompras r){
        return true;
    }
}
