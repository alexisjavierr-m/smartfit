package com.smartfit.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartfit.boot.dao.SalaDao;
import com.smartfit.boot.domain.Sala;

@Service
@Transactional(readOnly = false)
public class SalaServiceImpl implements SalaService {
	
	@Autowired
	private SalaDao dao;

	@Override
	public void salvar(Sala sala) {
		dao.save(sala);		
	}

	@Override
	public void editar(Sala sala) {
		dao.update(sala);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Sala buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Sala> buscarTodos() {
		
		return dao.findAll();
	}
}