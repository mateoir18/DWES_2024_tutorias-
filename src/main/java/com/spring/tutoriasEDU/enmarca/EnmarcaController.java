package com.spring.tutoriasEDU.enmarca;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutoriasEDU.actividad.Actividad;
import com.spring.tutoriasEDU.actividad.ActividadDao;
import com.spring.tutoriasEDU.planes.Plan;
import com.spring.tutoriasEDU.planes.PlanDao;
import com.spring.tutoriasEDU.tutores.Tutor;

@Controller
public class EnmarcaController {

	@Autowired
	EnmarcaDao enmarcaDao;

	@Autowired
	PlanDao planDao;

	@Autowired
	ActividadDao actividadDao;

	@GetMapping("/enmarca")
	public ModelAndView enmarcaciones() {

		ModelAndView model = new ModelAndView();
		model.setViewName("enmarcaciones");

		List<Enmarca> enmarcaciones = (List<Enmarca>) enmarcaDao.findAll();
		model.addObject("enmarcaciones", enmarcaciones);

		return model;
	}

	@GetMapping("/enmarca/{id}")
	public ModelAndView enmarcaciones(@PathVariable long id) {

		Enmarca enmarca = enmarcaDao.findById(id).get();

		ModelAndView model = new ModelAndView();
		model.setViewName("enmarcacion");
		model.addObject("enmarcacion", enmarca);

		return model;
	}

	@GetMapping("/enmarca/add")
	public ModelAndView addEnmarcacion() {

		ModelAndView model = new ModelAndView();
		model.setViewName("formEnmarca");
		model.addObject("enmarcacion", new Enmarca());

		model.addObject("planes", planDao.findAll());
		model.addObject("actividades", actividadDao.findAll());

		return model;
	}

	@GetMapping("/enmarca/edit/{id}")
	public ModelAndView editEnmarca(@PathVariable long id) {

		ModelAndView model = new ModelAndView();

		Optional<Enmarca> enmarcacion = enmarcaDao.findById(id);
		if (enmarcacion.isPresent()) {

			model.addObject("enmarca", enmarcacion.get());
			model.addObject("actividades", actividadDao.findAll());
			model.addObject("planes", planDao.findAll());

			model.setViewName("formEnmarca");
		} else
			model.setViewName("redirect:/enmarca");

		return model;
	}

	@GetMapping("/enmarca/del/{id}")
	public ModelAndView delEnmarca(@PathVariable long id) {

		enmarcaDao.deleteById(id);

		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/enmarca");

		return model;
	}

	@PostMapping("/enmarca/save")
	public ModelAndView formEnmarca(@ModelAttribute Enmarca enmarcacion) {
		
		Actividad actividad = enmarcacion.getActividad();
		enmarcacion.setActividad(actividad);
		
		enmarcaDao.save(enmarcacion);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/enmarca");

		return model;
	}

}
