package com.parcial.cvillalba.parcial.service;

import com.parcial.cvillalba.parcial.entity.Pais;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPaisService {

    public List<Pais> findAll();

}
