package com.cybage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pId")
	private int pId;
	
	@Column(name="pName", unique=true)
	private String pName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="pPass")
	private String pPass;

	@Column(name="contact")
	private String contact;
	
	@Column(name="pEmail")
	private String pEmail;
	
	@Column(name="address")
	private String address;

	@Column(name="regDate")
	private Date regDate;
	
	@Column(name="disease")
	private String disease;

	@Column(name="roomType")
	private String roomType;

	public Patient() {
		super();
	}

	public Patient(int pId, String pName, int age, String gender, String pPass, String contact, String pEmail,
			String address, Date regDate, String disease, String roomType) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
		this.gender = gender;
		this.pPass = pPass;
		this.contact = contact;
		this.pEmail = pEmail;
		this.address = address;
		this.regDate = regDate;
		this.disease = disease;
		this.roomType = roomType;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getpPass() {
		return pPass;
	}

	public void setpPass(String pPass) {
		this.pPass = pPass;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	
}
