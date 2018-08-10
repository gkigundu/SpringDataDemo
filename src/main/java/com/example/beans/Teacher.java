package com.example.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="demo")
public class Teacher extends Person {
	@Column(name="teacher_id")
	private Integer teacherID;
	@Column(name="subject")
	private String subject;
	@Column(name="department")
	private String department;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer teacherID, String subject, String department) {
		super();
		this.teacherID = teacherID;
		this.subject = subject;
		this.department = department;
	}
	public Integer getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
