package com.parcial.cvillalba.parcial.service;

import com.parcial.cvillalba.parcial.dao.ICiudadDao;
import com.parcial.cvillalba.parcial.dao.IPaisDao;
import com.parcial.cvillalba.parcial.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CiudadServiceImp  implements ICiudadService{

    @Autowired
    private ICiudadDao ciudadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> findBycodigo_pais(String codigo_pais) {
        return (List<Ciudad>) ciudadDao.findBycodigo(codigo_pais);
    }
}
