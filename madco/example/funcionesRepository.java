package com.core.madco.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("funcionesRepository")
public interface funcionesRepository extends JpaRepository<funciones, Serializable> {
    public abstract List<funciones> findByHora(String hora);

}
