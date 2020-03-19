package com.fdmgroup.medicationReminder.service;

public interface MedicationServiceRepository<Medication> {

	Medication findByNameAndDosage(String name, int dosage);
	
	
}
