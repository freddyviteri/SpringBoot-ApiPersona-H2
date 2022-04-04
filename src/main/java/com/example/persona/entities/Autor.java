package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "autor")
public class Autor extends  Base{
    private String nombre;
    private String apellido;
    private String biografia;
}
