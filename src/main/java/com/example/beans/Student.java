package com.example.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(schema="demo")
public class Student extends Person {
	@Column(name="student_id")
	@GeneratedValue
	private Integer studentID;
	@Column(name="major")
	private String major;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentID, String major) {
		super();
		this.studentID = studentID;
		this.major = major;
	}
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
