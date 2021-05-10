package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subCourceId;
	private String name;
	private float hours;
	
	@ManyToOne
	private Cource Cource;

	public int getSubCourceId() {
		return subCourceId;
	}

	public void setSubCourceId(int subCourceId) {
		this.subCourceId = subCourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public Cource getCource() {
		return Cource;
	}

	public void setCource(Cource cource) {
		Cource = cource;
	}

	public SubCource(int subCourceId, String name, float hours, com.nt.entity.Cource cource) {
		super();
		this.subCourceId = subCourceId;
		this.name = name;
		this.hours = hours;
		Cource = cource;
	}

	public SubCource() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
}
