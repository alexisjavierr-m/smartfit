package com.smartfit.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Estado")
public class Estado extends AbstractEntity<Long>{

	@Column(name = "estado", nullable = false, unique = false, length = 60)
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


}
