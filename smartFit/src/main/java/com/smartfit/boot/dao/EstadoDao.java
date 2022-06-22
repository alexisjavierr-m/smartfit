package com.smartfit.boot.dao;

import java.util.List;

import com.smartfit.boot.domain.Estado;

public interface EstadoDao {

    void save(Estado estado);

    void update(Estado estado);

    void delete(Long id);

    Estado findById(Long id);

    List<Estado> findAll();
	
}
