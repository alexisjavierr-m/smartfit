package com.smartfit.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

	@Column(name = "rut", nullable = false, unique = true, length = 60)
	private String rut;
	
	@Column(name = "nombre", nullable = false, unique = false, length = 60)
	private String nombre;
	
	@Column(name = "pass", nullable = false, unique = false, length = 60)
	private String pass;
	
	@Column(name = "correo", nullable = false, unique = false, length = 90)
	private String correo;
	
	/**
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	*/
	
	/**
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "direccion_id_fk")
	private Direccion direccion;
	
	*/
	
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
