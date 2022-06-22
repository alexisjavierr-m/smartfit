package com.smartfit.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartfit.boot.dao.EstadoDao;
import com.smartfit.boot.domain.Estado;

@Service
@Transactional(readOnly = false)
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoDao dao;

	@Override
	public void salvar(Estado estado) {
		dao.save(estado);		
	}

	@Override
	public void editar(Estado estado) {
		dao.update(estado);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Estado buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Estado> buscarTodos() {
		
		return dao.findAll();
	}
}
