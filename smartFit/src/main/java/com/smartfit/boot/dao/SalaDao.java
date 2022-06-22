package com.smartfit.boot.dao;

import java.util.List;

import com.smartfit.boot.domain.Sala;

public interface SalaDao {
	
    void save(Sala sala);

    void update(Sala sala);

    void delete(Long id);

    Sala findById(Long id);

    List<Sala> findAll();

}
