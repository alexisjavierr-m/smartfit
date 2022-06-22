package com.smartfit.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Clases")

public class Clase extends AbstractEntity<Long>{
	
	@Column(name = "monitor1", nullable = false, unique = false, length = 60)
	private String monitor1;
	
	@Column(name = "monitor2", nullable = false, unique = false, length = 60)
	private String monitor2;

	@ManyToOne
	@JoinColumn(name = "id_funcionario_fk")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name = "id_sala_fk")
	private Sala sala;

	public String getMonitor1() {
		return monitor1;
	}

	public void setMonitor1(String monitor1) {
		this.monitor1 = monitor1;
	}

	public String getMonitor2() {
		return monitor2;
	}

	public void setMonitor2(String monitor2) {
		this.monitor2 = monitor2;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	
}
