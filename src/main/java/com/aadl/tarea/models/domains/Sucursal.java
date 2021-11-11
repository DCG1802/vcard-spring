package com.aadl.tarea.models.domains;

import org.springframework.stereotype.Component;

@Component
public class Sucursal {
	private Ciudad ciudad;
	private Integer codigoSucursal;
	private String nombreSucursal;
	
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getCodigoSucursal() {
		return codigoSucursal;
	}
	public void setCodigoSucursal(Integer codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}
	public String getNombreSucursal() {
		return nombreSucursal;
	}
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}
	
	
}
