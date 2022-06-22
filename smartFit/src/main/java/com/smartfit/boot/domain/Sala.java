package com.smartfit.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Salas")
public class Sala extends AbstractEntity<Long> {

	@Column(name = "nombre", nullable = false, unique = false, length = 60)
	private String nombre;

    /**
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

     */
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name = "id_estado_fk")
	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
