package com.parcial.cvillalba.parcial.dao;

import com.parcial.cvillalba.parcial.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisDao  extends CrudRepository<Pais, Long> {
}
