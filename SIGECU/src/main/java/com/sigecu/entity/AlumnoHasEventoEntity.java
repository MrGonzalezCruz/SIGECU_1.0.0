package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Anel
 *
 */


@Entity
@Table(name = "alumno_has_eventos")
public class AlumnoHasEventoEntity {
	
	
	@ManyToOne
	@JoinColumn(name="a_idalumno")
	private AlumnoEntity idalumno;
	
	@ManyToOne
	@JoinColumn(name="e_idevento")
	private EventosEntity evento;
	
	@Column(name="confirmado")
	private String confirmado;
	@Column(name="activo")
	private String activo;
	
	@ManyToOne
	@JoinColumn(name="aE_idasignaExamen")
	private AsignaExamenEntity asigna;
	
	
	public String getConfirmado() {
		return confirmado;
	}
	public void setConfirmado(String confirmado) {
		this.confirmado = confirmado;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public AlumnoHasEventoEntity(String confirmado, String activo) {
		super();
		this.confirmado = confirmado;
		this.activo = activo;
		
	}
}
