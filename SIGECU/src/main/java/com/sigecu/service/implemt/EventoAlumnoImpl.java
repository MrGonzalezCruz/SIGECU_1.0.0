package com.sigecu.service.implemt;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.EventosConverter;
import com.sigecu.entity.Eventos;
import com.sigecu.model.AlumnoModel;
import com.sigecu.model.EventosModel;
import com.sigecu.repository.EventosAlumnoRepository;
import com.sigecu.repository.QueryEventoAlumno;
import com.sigecu.service.eventoAlumnoService;

@Service("eventoAlumnoImpl")
public class EventoAlumnoImpl implements eventoAlumnoService{
	private static final Log LOG=LogFactory.getLog(EventoAlumnoImpl.class);
	
    @Autowired 
	@Qualifier("eventosAlumnoRepository")
     private EventosAlumnoRepository eventosAlumnoRepository;
    
    @Autowired
    @Qualifier("eventosConverter")
    private EventosConverter eventosConverter;
    
    @Autowired
    @Qualifier("queryEventoAlumno")
    private QueryEventoAlumno queryEventoAlumno;

	@Override
	public List<EventosModel> listAllEventosAl(int idAlumno) {
		List<Eventos> eventos = queryEventoAlumno.findAllEventosAlumnosById(idAlumno);
		List<EventosModel> eventosModel=new ArrayList<EventosModel>();
		
		for(Eventos evento: eventos) {
			eventosModel.add(eventosConverter.convertEventoToEentoModel(evento));
		}
		LOG.info("Eventos" + idAlumno);
		
		LOG.info("FECHA" + eventosModel.get(1).getE_fecha_inicio());
		return eventosModel;
	}

	@Override
	public List<AlumnoModel> listaAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}
    
//    @Autowired
//    @Qualifier("alumnoConverter")
//    

//	@Override
//	public List<Evento> listAllEventosAl(int idEvento) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<AlumnoModel> listaAlumnos() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}