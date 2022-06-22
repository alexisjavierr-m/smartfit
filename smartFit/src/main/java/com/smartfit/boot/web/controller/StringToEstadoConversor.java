package com.smartfit.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.smartfit.boot.domain.Estado;
import com.smartfit.boot.service.EstadoService;

@Component
public class StringToEstadoConversor implements Converter<String, Estado> {

	@Autowired
	private EstadoService service;
	
	@Override
	public Estado convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}
}
