package com.cybage.model;

import java.io.InputStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.mysql.cj.jdbc.Blob;

@Entity
@Table(name="tutor")
public class AddMaterial
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="category")
	private String category;

	@Lob
	@Column(name="material")
	private Blob material;
	
	public AddMaterial() {
		super();
	}

	

	public AddMaterial(int id, String category, Blob material) {
		super();
		this.id = id;
		this.category = category;
		this.material = material;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	public Blob getMaterial() {
		return material;
	}



	public void setMaterial(Blob material) {
		this.material = material;
	}




}
