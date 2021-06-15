package com.cybage.dao;

import java.sql.Date;
import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cybage.model.Appointment;
import com.cybage.model.Department;
import com.cybage.model.Doctor;
import com.cybage.model.Patient;

public class AppointmentDaoImple implements AppointmentDao
{

	public static void main(String[] args)
	{
		AppointmentDaoImple addAppoint=new AppointmentDaoImple();
		addAppoint.addAppointment();
	}

	public void addAppointment()
	{
		Department dept3=new Department();
		dept3.setDeptId(103);
		dept3.setDeptName("Neurology");
		
		Doctor doc1 = new Doctor();
		doc1.setdId(1002);
		doc1.setdName("Tony Hanks");
		doc1.setdPass("doc123");
		doc1.setdAge(32);
		doc1.setdGender("male");
		doc1.setdContact("9988776655");
		doc1.setdEmail("doc1@gmail.com");
		doc1.setDegree("MBBS");
		doc1.setdStatus("available");
		doc1.setDepartment(dept3);
		
		
		Patient patient1=new Patient();
		patient1.setpPass("p123");
		patient1.setpName("Billy Butcher");
		patient1.setAge(30);
		patient1.setGender("male");
		patient1.setContact("9876543210");
		patient1.setpEmail("patient1@gmail.com");
		patient1.setAddress("New Delhi");
		patient1.setDisease("Headache");
		patient1.setRoomType("deluxe");
		patient1.setRegDate(Date.valueOf("2021-06-11"));
		
		Appointment appoint1=new Appointment();
		appoint1.setAppDate(Date.valueOf("2021-06-13"));
		appoint1.setAppTime(Time.valueOf("13:30:00"));
		appoint1.setStatus("pending");
		appoint1.setDoctor(doc1);
		appoint1.setPatient(patient1);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Appointment.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(appoint1);
		tx.commit();
	}

}
