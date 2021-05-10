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
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	
	private String Name;
	
	private String Email;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_cource")
	private List<Cource> course;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_address")
	private List<Address> address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_phone")
	private List<Phone> phone;
	
	

	@OneToOne
	@JoinColumn(name = "studId", referencedColumnName = "studId")
	private TimeSheet  timeSteet;



	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public List<Cource> getCourse() {
		return course;
	}



	public void setCourse(List<Cource> course) {
		this.course = course;
	}



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	public List<Phone> getPhone() {
		return phone;
	}



	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}



	public TimeSheet getTimeSteet() {
		return timeSteet;
	}



	public void setTimeSteet(TimeSheet timeSteet) {
		this.timeSteet = timeSteet;
	}



	public StudentEntity(int studId, String name, String email, List<Cource> course, List<Address> address,
			List<Phone> phone, TimeSheet timeSteet) {
		super();
		this.studId = studId;
		Name = name;
		Email = email;
		this.course = course;
		this.address = address;
		this.phone = phone;
		this.timeSteet = timeSteet;
	}



	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	
	
}
