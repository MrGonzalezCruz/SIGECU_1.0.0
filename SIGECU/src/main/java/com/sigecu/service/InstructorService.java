/**
 * 
 */
package com.sigecu.service;

import java.util.List;

import com.sigecu.model.AlumnoModel;
import com.sigecu.model.EventosModel;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 09/01/2018
 *
 */
public interface InstructorService {
	public abstract List<EventosModel> eventosPorInstructor(int idInstructor);
	public abstract List<AlumnoModel> alumnosPorEvento(int idEvento);
}
