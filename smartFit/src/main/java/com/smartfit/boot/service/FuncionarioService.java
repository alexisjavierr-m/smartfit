package com.smartfit.boot.service;

import java.util.List;

import com.smartfit.boot.domain.Funcionario;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);
	
	List<Funcionario> buscarPorDepartamento(Long id);
}
