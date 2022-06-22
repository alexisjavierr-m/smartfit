package com.smartfit.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smartfit.boot.domain.Funcionario;


@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	public List<Funcionario> findByNome(String nome) {
		
		return createQuery("select f from Funcionario f where f.nombre like concat('%',?1,'%') ", nome);
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}
	
	@Override
	public List<Funcionario> findByDepartamentoId(Long id) {
		
		return createQuery("select f from Funcionario f where f.departamento.id = ?1", id);
	}

	
}
