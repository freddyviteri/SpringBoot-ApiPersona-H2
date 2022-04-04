package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Libro extends Base {
    private String titulo;
    private Date fecha;
    private String genero;
    private Integer paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores = new ArrayList<Autor>();
}
