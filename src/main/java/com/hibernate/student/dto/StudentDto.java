package com.hibernate.student.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class StudentDto implements Serializable{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "higestQualification")
	private String highestQualification;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	
	
	

}
