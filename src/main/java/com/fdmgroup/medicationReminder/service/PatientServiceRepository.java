package com.fdmgroup.medicationReminder.service;

import java.util.Optional;

public interface PatientServiceRepository<Patient> {
	
	Optional<Patient> findByUsernameAndPassword(String username, String password);
	
	Optional<Patient> findByUsername(String username);
	
	Optional<Patient> findById(Long id);
	
	Patient save (Patient patient);
}
