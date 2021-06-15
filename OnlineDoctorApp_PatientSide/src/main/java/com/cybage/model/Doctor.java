package com.cybage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor
{
	@Id
	@Column(name="dId")
	private int dId;
	
	@Column(name="dPass")
	private String dPass;
	
	@Column(name="dName")
	private String dName;
	
	@Column(name="dGender")
	private String dGender;
	
	@Column(name="dAge")
	private int dAge;
	
	@Column(name="dContact")
	private String dContact;
	
	@Column(name="dEmail")
	private String dEmail;
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="dStatus")
	private String dStatus;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="deptId")	
	private Department department;
	
	public Doctor() {
		super();
	}

	public Doctor(int dId, String dPass, String dName, String dGender, int dAge, String dContact, String dEmail,
			String degree, String dStatus, Department department) {
		super();
		this.dId = dId;
		this.dPass = dPass;
		this.dName = dName;
		this.dGender = dGender;
		this.dAge = dAge;
		this.dContact = dContact;
		this.dEmail = dEmail;
		this.degree = degree;
		this.dStatus = dStatus;
		this.department = department;
	}



	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdPass() {
		return dPass;
	}

	public void setdPass(String dPass) {
		this.dPass = dPass;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdGender() {
		return dGender;
	}

	public void setdGender(String dGender) {
		this.dGender = dGender;
	}

	public int getdAge() {
		return dAge;
	}

	public void setdAge(int dAge) {
		this.dAge = dAge;
	}

	public String getdContact() {
		return dContact;
	}

	public void setdContact(String dContact) {
		this.dContact = dContact;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getdStatus() {
		return dStatus;
	}

	public void setdStatus(String dStatus) {
		this.dStatus = dStatus;
	}
	
}
