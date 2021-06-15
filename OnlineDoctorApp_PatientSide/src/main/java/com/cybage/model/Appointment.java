package com.cybage.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointId")
	private int appointId;
	
	@Column(name="appDate")
	private Date appDate;
	
	@Column(name="appTime")
	private Time appTime;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dId")	
	private Doctor doctor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pId")	
	private Patient patient;

	public Appointment() {
		super();
	}

	

	public Appointment(int appointId, Date appDate, Time appTime, String status, Doctor doctor, Patient patient) {
		super();
		this.appointId = appointId;
		this.appDate = appDate;
		this.appTime = appTime;
		this.status = status;
		this.doctor = doctor;
		this.patient = patient;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public int getAppointId() {
		return appointId;
	}

	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}


	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Time getAppTime() {
		return appTime;
	}

	public void setAppTime(Time appTime) {
		this.appTime = appTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
