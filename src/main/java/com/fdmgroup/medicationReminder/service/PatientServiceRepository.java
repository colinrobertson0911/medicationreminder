package com.fdmgroup.medicationReminder.service;

public interface PatientServiceRepository<Patient> {
	
	Patient findByUsernameAndPassword(String username, String password);
	
	Patient findByUsername(String username);
	
	Patient save (Patient patient);
}
