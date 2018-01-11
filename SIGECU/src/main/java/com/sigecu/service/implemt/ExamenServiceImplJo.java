
package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;
import com.sigecu.repository.PreguntasRepository;
import com.sigecu.service.ExamenJoshService;

/**
 * @author Dell
 *
 */
@Service("ExamenService1")
public class ExamenServiceImplJo implements ExamenJoshService {

	@Autowired
	@Qualifier("preguntasRepository")
	private PreguntasRepository preguntasrepo;
	
	@Autowired 
	
	@Override
	public List<RespuestaALMEntity> listaRespuestasAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PreguntasModel> listarPreguntas(int Eval) {
		
		
		/*Evaluaciones eval = new Evaluaciones();
		Preguntas pregu = preguntasrepo.findByEvaluaciones(eva);
		List<PreguntasModel> premo = new ArrayList<>();
		while(pregu.getRespuestas().iterator() != null) {
		pregu.getRespuestas().iterator().next().getIdRespuesta();
		}*/
		return null;
	}

	@Override
	public List<RespuestasModel> listaRespuestas(int idEvaluacion) {
		Preguntas pregu = preguntasrepo.findByEvaluacionesIdEvaluacion(idEvaluacion);
		List<RespuestasModel> resmodel = new ArrayList<>();
		
		return null;
	}

	
}
