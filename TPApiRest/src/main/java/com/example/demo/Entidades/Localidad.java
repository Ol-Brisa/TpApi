package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "localidad")
public class Localidad extends Base{
    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name="localidad_id")
    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();
    public void agregarDomicilios(Domicilio domi){
        domicilios.add(domi);
    }
    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + denominacion + ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle());
            System.out.println("Número: " + domicilio.getNumero());
        }

    }

}
