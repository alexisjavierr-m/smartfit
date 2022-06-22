package com.smartfit.boot.service;

import java.util.List;

import com.smartfit.boot.domain.Estado;

public interface EstadoService {

    void salvar(Estado estado);

    void editar(Estado estado);

    void excluir(Long id);

    Estado buscarPorId(Long id);
    
    List<Estado> buscarTodos();
	
}
