package com.fdmgroup.medicationReminder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.repository.PatientDao;

@Service
public class PatientService implements PatientServiceRepository<Patient> {

	@Autowired
	private PatientDao patientDao;

	@Override
	public Optional<Patient> findByUsernameAndPassword(String username, String password) {
		return patientDao.findByUsernameAndPassword(username, password);
	}

	@Override
	public Optional<Patient> findByUsername(String username) {
		return patientDao.findByUsername(username);
	}
	
	@Override
	public Optional<Patient> findById(Long id){
		return patientDao.findById(id);
	}

	public Patient save(Patient patient) {
		return patientDao.save(patient);
	}

	public List<Patient> findAll() {
		return patientDao.findAll();
	}
	

}
