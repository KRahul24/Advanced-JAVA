package com.cybage.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cybage.model.AddMaterial;

public class MaterialDao
{
	public void insertMaterial(AddMaterial obj)
	{
		System.out.println("inside insertMaterial");
		Configuration con = new Configuration().configure().addAnnotatedClass(AddMaterial.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(obj);
		tx.commit();
	}
}
