package com.smartfit.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartfit.boot.dao.ClaseDao;
import com.smartfit.boot.domain.Clase;

@Service
@Transactional(readOnly = false)
public class ClaseServiceImpl implements ClaseService {

	@Autowired
	private ClaseDao dao;

	@Override
	public void salvar(Clase clase) {
		dao.save(clase);		
	}

	@Override
	public void editar(Clase clase) {
		dao.update(clase);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Clase buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Clase> buscarTodos() {
		return dao.findAll();
	}
	
}
