package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studAddressId;
	
	private String studCity;
	
	private String studDist;
	
	private String studPO;
	
	private String studPinNumber;
	
	@ManyToOne
	private StudentEntity studentEntity;

	public int getStudAddressId() {
		return studAddressId;
	}

	public void setStudAddressId(int studAddressId) {
		this.studAddressId = studAddressId;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public String getStudDist() {
		return studDist;
	}

	public void setStudDist(String studDist) {
		this.studDist = studDist;
	}

	public String getStudPO() {
		return studPO;
	}

	public void setStudPO(String studPO) {
		this.studPO = studPO;
	}

	public String getStudPinNumber() {
		return studPinNumber;
	}

	public void setStudPinNumber(String studPinNumber) {
		this.studPinNumber = studPinNumber;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public Address(int studAddressId, String studCity, String studDist, String studPO, String studPinNumber,
			StudentEntity studentEntity) {
		super();
		this.studAddressId = studAddressId;
		this.studCity = studCity;
		this.studDist = studDist;
		this.studPO = studPO;
		this.studPinNumber = studPinNumber;
		this.studentEntity = studentEntity;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
