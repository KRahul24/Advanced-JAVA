package com.cybage.dao;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cybage.model.Department;
import com.cybage.model.Patient;

public class PatientDaoImple implements PatientDao
{
//	public void addPatient() 
//	{
//		Patient patient1=new Patient();
//		patient1.setpPass("p123");
//		patient1.setpName("Amanda Miller");
//		patient1.setAge(30);
//		patient1.setGender("male");
//		patient1.setContact("9876543210");
//		patient1.setpEmail("patient1@gmail.com");
//		patient1.setAddress("New Delhi");
//		patient1.setDisease("Headache");
//		patient1.setRoomType("deluxe");
//		patient1.setRegDate(Date.valueOf("2021-06-11"));
//		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Patient.class);
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		
//		Transaction tx = session.beginTransaction();
//		
//		session.save(patient1);
//		tx.commit();
//	}
	
	public void registerPatient(Patient newPatient)
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(Patient.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(newPatient);
		tx.commit();
	}

	@Override
	public Patient patientLogin(String pEmail, String pPassword)
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(Patient.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Patient> listOfPatients = null;
		Patient gotPatient=new Patient();
		boolean result=false;
		listOfPatients = session.createQuery("from Patient").getResultList();
		
		for(Patient patient : listOfPatients) 
		{
			if(patient.getpEmail().equals(pEmail) && patient.getpPass().equals(pPassword))
			{
				result=true;
				gotPatient=patient;
				break;
			}
		}
		tx.commit();
		if(result)
		{
			return gotPatient;
		}
		else 
			return null;
	}

}
