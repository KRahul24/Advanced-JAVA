package com.cybage.dao;

import com.cybage.model.Patient;

public interface PatientDao 
{
	void registerPatient(Patient newPatient);
	Patient patientLogin(String pEmail, String pPassword);
}
