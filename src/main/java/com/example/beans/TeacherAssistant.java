package com.example.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="demo")
public class TeacherAssistant extends Student{
	@Column(name="subject")
	private String subject;
	@Column(name="department")
	private String department;
	
	public TeacherAssistant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherAssistant(Integer studentID, String major) {
		super(studentID, major);
		// TODO Auto-generated constructor stub
	}
	public TeacherAssistant(String subject, String department) {
		super();
		this.subject = subject;
		this.department = department;
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
