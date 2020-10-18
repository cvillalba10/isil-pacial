package com.parcial.cvillalba.parcial.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Ciudades")
public class Ciudad {

    @Id
    private Long id;
    private String name;
    @Column(name = "codigo_pais")
    private String codigo;


}
