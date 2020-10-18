package com.parcial.cvillalba.parcial.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Paises")
public class Pais {

    @Id
    private  long id;
    private String codigo_pais;


    @Column(name="Pais")
    private String name;





}
