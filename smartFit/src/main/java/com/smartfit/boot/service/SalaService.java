package com.smartfit.boot.service;

import java.util.List;

import com.smartfit.boot.domain.Sala;

public interface SalaService {
	
    void salvar(Sala sala);

    void editar(Sala sala);

    void excluir(Long id);

    Sala buscarPorId(Long id);
    
    List<Sala> buscarTodos();


}
