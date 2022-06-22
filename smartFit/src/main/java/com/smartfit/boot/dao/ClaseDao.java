package com.smartfit.boot.dao;

import java.util.List;

import com.smartfit.boot.domain.Clase;

public interface ClaseDao{

	void save(Clase clase);

    void update(Clase clase);

    void delete(Long id);

    Clase findById(Long id);

    List<Clase> findAll();

}
