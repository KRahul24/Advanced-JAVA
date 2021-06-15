package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department 
{
	@Id
	@Column(name="deptId")
	private int deptId;
	
	@Column(name="deptName", unique=true)
	private String deptName;
	
	public Department()
	{
		
	}
	
	public Department(int deptId, String deptName)
	{
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
