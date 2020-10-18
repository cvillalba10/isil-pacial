package com.parcial.cvillalba.parcial.controller;


import com.parcial.cvillalba.parcial.entity.Ciudad;
import com.parcial.cvillalba.parcial.entity.Pais;
import com.parcial.cvillalba.parcial.entity.ResponsePaises;
import com.parcial.cvillalba.parcial.service.ICiudadService;
import com.parcial.cvillalba.parcial.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PaisController {

    @Autowired
    private IPaisService paisService;
    @Autowired
    private ICiudadService ciudadService;


    @GetMapping("/paises")
    public List<ResponsePaises> index() {

        List<ResponsePaises> response= new ArrayList<>();
        List<Pais> x = paisService.findAll();
        for(Pais valor : x)
        {
            ResponsePaises temp = new ResponsePaises();
            List<Ciudad> z = ciudadService.findBycodigo_pais(valor.getCodigo_pais());
            temp.setId(valor.getId());
            temp.setCodigo_pais(valor.getCodigo_pais());
            temp.setName(valor.getName());
            temp.setCiudades(z);

            response.add(temp);

        }

        return response;
    }

}
