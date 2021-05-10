package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TimeSheet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int timeSheetId;
	
	
	
	private int studId;
	
	private float timeSheetHours;
	
	private float timeSheetPandingHours;
	
	
	private int courceId;


	public int getTimeSheetId() {
		return timeSheetId;
	}


	public void setTimeSheetId(int timeSheetId) {
		this.timeSheetId = timeSheetId;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public float getTimeSheetHours() {
		return timeSheetHours;
	}


	public void setTimeSheetHours(float timeSheetHours) {
		this.timeSheetHours = timeSheetHours;
	}


	public float getTimeSheetPandingHours() {
		return timeSheetPandingHours;
	}


	public void setTimeSheetPandingHours(float timeSheetPandingHours) {
		this.timeSheetPandingHours = timeSheetPandingHours;
	}


	public int getCourceId() {
		return courceId;
	}


	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}


	public TimeSheet(int timeSheetId, int studId, float timeSheetHours, float timeSheetPandingHours, int courceId) {
		super();
		this.timeSheetId = timeSheetId;
		this.studId = studId;
		this.timeSheetHours = timeSheetHours;
		this.timeSheetPandingHours = timeSheetPandingHours;
		this.courceId = courceId;
	}


	public TimeSheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@OneToMany
//	private StudentEntity studentEntity;
//	
//	@OneToMany
//	private StudCource studCource;

	
	
	
	
	
	
	
	
	
}
