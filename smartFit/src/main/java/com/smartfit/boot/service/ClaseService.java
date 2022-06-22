package com.smartfit.boot.service;

import java.util.List;

import com.smartfit.boot.domain.Clase;

public interface ClaseService {
	
	void salvar(Clase clase);
	
	void editar(Clase clase);
	
	void excluir(Long id);
	
	Clase buscarPorId(Long id);
	
	List<Clase> buscarTodos();

}
