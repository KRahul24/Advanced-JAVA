package com.cybage.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cybage.model.Department;
import com.cybage.model.Doctor;

public class DepartmentDaoImple implements DepartmentDao
{
	public static void main(String[] args) 
	{
		DepartmentDaoImple add = new DepartmentDaoImple();
		add.addDept();
	}

	public void addDept() 
	{
		Department dept1=new Department();
		dept1.setDeptId(101);
		dept1.setDeptName("Cardiology");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Department.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dept1);
		
		tx.commit();
		
	}

}

