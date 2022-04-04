package com.example.persona.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona extends Base  {
    private String nombre;
    private String apellido;
    private String identificacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "persona_libros",
            joinColumns = @JoinColumn(name = "persona_id"),
    inverseJoinColumns = @JoinColumn(name = "Libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();


}
