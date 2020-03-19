package com.fdmgroup.medicationReminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.medicationReminder.model.Medication;
import com.fdmgroup.medicationReminder.repository.MedicationDao;

@Service
public class MedicationService implements MedicationServiceRepository<Medication>{

	@Autowired
	private MedicationDao medicationDao;
	
	@Override
	public Medication findByNameAndDosage(String name, int dosage) {
		return medicationDao.findByNameAndDosage(name, dosage);
	}

	public List<Medication> retrieveAll() {
		return medicationDao.findAll();
	}

	public Medication findByMedicationId(long medicationId) {
		return medicationDao.findByMedicationId(medicationId);
	}

	public Medication retrieveByMedicationId(long medicationId) {
		return medicationDao.findByMedicationId(medicationId);
	}

	public Medication save(Medication medication) {
		return medicationDao.save(medication);
	}

	public Medication retrieveByName(String name) {
		return medicationDao.findByName(name);
	}

	

	

}
