package com.parcial.cvillalba.parcial.entity;


import lombok.Data;

import java.util.List;
@Data
public class ResponsePaises {


    private  long id;
    private String codigo_pais;
    private String name;
    private List<Ciudad> ciudades;

}
