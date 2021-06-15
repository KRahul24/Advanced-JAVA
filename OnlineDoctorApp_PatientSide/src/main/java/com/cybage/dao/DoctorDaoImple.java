package com.cybage.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cybage.model.Department;
import com.cybage.model.Doctor;

public class DoctorDaoImple implements DoctorDao
{
	public static void main(String[] args)
	{
		DoctorDaoImple doctor = new DoctorDaoImple();
		doctor.addDoctor();
	}

	public void addDoctor()
	{

		Department dept1=new Department();
		dept1.setDeptId(102);
		dept1.setDeptName("Orthopedic");
		
		Doctor doc1 = new Doctor();
		doc1.setdId(1001);
		doc1.setdName("John Siemens");
		doc1.setdPass("doc123");
		doc1.setdAge(32);
		doc1.setdGender("male");
		doc1.setdContact("9988776655");
		doc1.setdEmail("doc1@gmail.com");
		doc1.setDegree("MBBS");
		doc1.setdStatus("available");
		doc1.setDepartment(dept1);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Doctor.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(doc1);
		
		tx.commit();
		session.close();
		sf.close();
		
	}

}
