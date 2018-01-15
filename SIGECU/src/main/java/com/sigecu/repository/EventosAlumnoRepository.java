package com.sigecu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.Eventos;

@Repository("eventosAlumnoRepository")
public interface EventosAlumnoRepository extends JpaRepository <Eventos, Serializable>{

}
