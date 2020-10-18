package com.parcial.cvillalba.parcial.service;

import com.parcial.cvillalba.parcial.dao.IPaisDao;
import com.parcial.cvillalba.parcial.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PaisServiceImp implements IPaisService {

    @Autowired
    private IPaisDao paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> findAll() {


        return (List<Pais>) paisDao.findAll();
    }
}
