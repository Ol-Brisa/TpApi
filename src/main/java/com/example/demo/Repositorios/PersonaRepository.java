package com.example.demo.Repositorios;

import com.example.demo.Entidades.Persona;
import org.springframework.stereotype.Repository;//agregar

@Repository

public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
