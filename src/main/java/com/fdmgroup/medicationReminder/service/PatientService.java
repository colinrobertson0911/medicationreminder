package com.fdmgroup.medicationReminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.repository.PatientDao;

@Service
public class PatientService implements PatientServiceRepository<Patient>  {

	@Autowired
	private PatientDao patientDao;
	
	@Override
	public Patient findByUsernameAndPassword(String username, String password) {
		return patientDao.findByUsernameAndPassword(username, password);
	}
	
	@Override
	public Patient findByUsername(String username) {
		return patientDao.findByUsername(username);
	}
	
	public Patient save(Patient patient) {
		return patientDao.save(patient);
	}

	public List<Patient> retrieveAll() {
		return patientDao.findAll();
	}

	

	

	

}
