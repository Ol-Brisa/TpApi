package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "domicilio")
public class Domicilio extends Base{
    private String calle;
    private int numero;


}
