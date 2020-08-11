package com.habilidad.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Skill
{
	@GeneratedValue
	@Id
	private int id;
	private String habilidad;
	
	@OneToMany(mappedBy="skill")
	private List<Ranking> ranking = new ArrayList<Ranking>();
	

	public Skill(String habilidad) {
		super();
		this.habilidad = habilidad;
	}
	
	public Skill() 
	{
	
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	


	public List<Ranking> getRanking() {
		return ranking;
	}

	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", habilidad=" + habilidad + "]";
	}
	
	
	
	

}
