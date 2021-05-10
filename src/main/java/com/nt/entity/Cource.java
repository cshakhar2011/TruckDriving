package com.nt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courceId;
	private String courceName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_subcourse")
	private List<SubCource> subCource;
	
	private String TotalHours;
	
	@ManyToOne
	private StudentEntity studentEntity;

	public int getCourceId() {
		return courceId;
	}

	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public List<SubCource> getSubCource() {
		return subCource;
	}

	public void setSubCource(List<SubCource> subCource) {
		this.subCource = subCource;
	}

	public String getTotalHours() {
		return TotalHours;
	}

	public void setTotalHours(String totalHours) {
		TotalHours = totalHours;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public Cource(int courceId, String courceName, List<SubCource> subCource, String totalHours,
			StudentEntity studentEntity) {
		super();
		this.courceId = courceId;
		this.courceName = courceName;
		this.subCource = subCource;
		TotalHours = totalHours;
		this.studentEntity = studentEntity;
	}

	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
}
