package com.parcial.cvillalba.parcial.service;

import com.parcial.cvillalba.parcial.entity.Ciudad;

import java.util.List;

public interface ICiudadService {

    public List<Ciudad> findBycodigo_pais(String codigo_pais);
}
