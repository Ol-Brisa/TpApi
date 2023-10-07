package com.example.demo.Repositorios;

import com.example.demo.Entidades.Localidad;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository; //agregar

@Repository

public interface LocalidadRepository extends BaseRepository<Localidad, Long>{
}
