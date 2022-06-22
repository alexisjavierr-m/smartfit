package com.smartfit.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.smartfit.boot.domain.Sala;
import com.smartfit.boot.service.SalaService;

@Component
public class StringToSalaConversor implements Converter<String, Sala> {
	
	@Autowired
	private SalaService service;
	
	@Override
	public Sala convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	} 

}
