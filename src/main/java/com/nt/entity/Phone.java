package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int phoneId;
	private String firstPhoneNo;
	private String secondPhoneNo;
	
	@ManyToOne
	private StudentEntity studentEntity;

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getFirstPhoneNo() {
		return firstPhoneNo;
	}

	public void setFirstPhoneNo(String firstPhoneNo) {
		this.firstPhoneNo = firstPhoneNo;
	}

	public String getSecondPhoneNo() {
		return secondPhoneNo;
	}

	public void setSecondPhoneNo(String secondPhoneNo) {
		this.secondPhoneNo = secondPhoneNo;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public Phone(int phoneId, String firstPhoneNo, String secondPhoneNo, StudentEntity studentEntity) {
		super();
		this.phoneId = phoneId;
		this.firstPhoneNo = firstPhoneNo;
		this.secondPhoneNo = secondPhoneNo;
		this.studentEntity = studentEntity;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
}
