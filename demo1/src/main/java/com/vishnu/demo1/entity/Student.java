package com.vishnu.demo1.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vishnu.demo1.costant.Appconstant;

@Entity
@Table(name=Appconstant.DETAIL_INFO)

public class Student implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="college")
	private String College;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", College=" + College + "]";
	}
	
	
	

}
