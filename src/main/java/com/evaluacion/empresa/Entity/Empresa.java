package com.evaluacion.empresa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empresas")
public class Empresa {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEmpresa")
	private Long idEmpresa;
	
	@Column(nullable = false)
	private String ruc;
	@Column(nullable = false)
	private String razonSocial;
	
	private Boolean estado;
	/**
	 * @return the idEmpresa
	 */
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	/**
	 * @return the ruc
	 */
	public String getRuc() {
		return ruc;
	}
	/**
	 * @param ruc the ruc to set
	 */
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
