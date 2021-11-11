package com.aadl.tarea.models.domains;

import org.springframework.stereotype.Component;

@Component
public class Ciudad {

	private Integer codigoCiudad;
	private String nombreCiudad;
	
	
	public Integer getCodigoCiudad() {
		return codigoCiudad;
	}
	public void setCodigoCiudad(Integer codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
}
