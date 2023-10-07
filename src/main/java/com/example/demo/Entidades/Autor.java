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
@Table(name = "autor")
public class Autor extends Base {
    private String nombre;
    private String apellido;
    private String biografia;

    @ManyToMany(cascade =
            {CascadeType.PERSIST,
                    CascadeType.MERGE})
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )

    // Se puede producir ERRORES DE RECURSIVIDAD POR ESO EN LOMBOCK HAY QUE
    // eXCLUIR LOS MÉTODOS  Equals y HashCode
    @EqualsAndHashCode.Exclude
    // OJO ES IMPORTANTE COLOCAR ESTA ANOTACIÓN SINO ME DA ERROR
    @Builder.Default
    private java.util.Set<Libro> libros = new HashSet<>();


    public void agregarLibro(Libro Lib) {

        libros.add(Lib);
    }

    public void mostrarLibros() {
        System.out.println("Libros de " + nombre + " " + apellido + ":");
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("Fecha: " + libro.getFecha());
            System.out.println("Páginas: " + libro.getPaginas());
        }

    }
}
