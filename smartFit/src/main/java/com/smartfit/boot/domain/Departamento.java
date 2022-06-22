package com.smartfit.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

	@Column(name = "nombre", nullable = false, unique = false, length = 60)
	private String nombre;
	
	@Column(name = "regionSede", nullable = false, unique = false, length = 60)
	private String regionSede;
	
	@Column(name = "comunaSede", nullable = false, unique = false, length = 60)
	private String comunaSede;
	
    /**
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

     */

	public String getRegionSede() {
		return regionSede;
	}

	public void setRegionSede(String regionSede) {
		this.regionSede = regionSede;
	}

	public String getComunaSede() {
		return comunaSede;
	}

	public void setComunaSede(String comunaSede) {
		this.comunaSede = comunaSede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

