package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.HashSet;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "libro")
public class Libro extends Base{
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private String autor;


}
