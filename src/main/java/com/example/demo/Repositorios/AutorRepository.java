package com.example.demo.Repositorios;

import com.example.demo.Entidades.Autor;
import org.springframework.stereotype.Repository;//Agregar esto

@Repository
public interface AutorRepository  extends  BaseRepository<Autor, Long>{
}
