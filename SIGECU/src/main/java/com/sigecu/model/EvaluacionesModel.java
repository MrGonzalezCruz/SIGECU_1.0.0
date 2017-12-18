/**
 * 
 */
package com.sigecu.model;

import java.sql.Time;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 14/12/2017
 *
 */
public class EvaluacionesModel {

	/**
	 * 
	 */
	private int idevaluacion;
	private String eNombre;
	private int idCurso;
	private Time eTiempo;
	private String ePorcentaje;
	
	public EvaluacionesModel() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the idCurso
	 */
	public int getIdCurso() {
		return idCurso;
	}


	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}


	/**
	 * @return the idevaluacion
	 */
	public int getIdevaluacion() {
		return idevaluacion;
	}

	/**
	 * @param idevaluacion the idevaluacion to set
	 */
	public void setIdevaluacion(int idevaluacion) {
		this.idevaluacion = idevaluacion;
	}

	/**
	 * @return the eNombre
	 */
	public String geteNombre() {
		return eNombre;
	}

	/**
	 * @param eNombre the eNombre to set
	 */
	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	/**
	 * @return the eTiempo
	 */
	public Time geteTiempo() {
		return eTiempo;
	}

	/**
	 * @param eTiempo the eTiempo to set
	 */
	public void seteTiempo(Time eTiempo) {
		this.eTiempo = eTiempo;
	}

	/**
	 * @return the ePorcentaje
	 */
	public String getePorcentaje() {
		return ePorcentaje;
	}

	/**
	 * @param ePorcentaje the ePorcentaje to set
	 */
	public void setePorcentaje(String ePorcentaje) {
		this.ePorcentaje = ePorcentaje;
	}
	

}
