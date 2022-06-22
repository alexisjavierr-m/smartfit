package com.smartfit.boot.domain;

public enum UF {

	RM("RM", "Región Metropolitana"), 
	VI("VIII", "Región del Bio Bio"),
	XV("XV", "El sur");

	
	private String sigla;
	private String descricao;
	
	UF(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
}

