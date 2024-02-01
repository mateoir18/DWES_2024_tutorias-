package com.spring.tutoriasEDU.enmarca;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.tutoriasEDU.actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

public interface EnmarcaDao extends CrudRepository<Enmarca, Long> {

	List<Enmarca> findByPlanAndActividad(Plan plan, Actividad actividad);

}
