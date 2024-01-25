package com.spring.tutoriasEDU.enmarca;

import com.spring.tutoriasEDU.actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enmarca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "FK_PLAN")
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "FK_ACTIVIDAD")
	private Actividad actividad;

	private String fecha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Enmarca [id=" + id + ", plan=" + plan + ", fecha=" + fecha + "]";
	}

}
