package com.parcial.cvillalba.parcial.dao;

import com.parcial.cvillalba.parcial.entity.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICiudadDao extends CrudRepository<Ciudad,Long> {

    List<Ciudad> findBycodigo(String codigo);
}
