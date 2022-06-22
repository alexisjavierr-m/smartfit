package com.smartfit.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.smartfit.boot.domain.Funcionario;
import com.smartfit.boot.service.FuncionarioService;

@Component
public class StringToFuncionarioConversor implements Converter<String, Funcionario> {
	

	@Autowired
	private FuncionarioService service;
	
	@Override
	public Funcionario convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
