package com.fdmgroup.medicationReminder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.medicationReminder.model.Medication;
import com.fdmgroup.medicationReminder.repository.MedicationDao;

@Service
public class MedicationService implements MedicationServiceRepository<Medication> {

	@Autowired
	private MedicationDao medicationDao;

	@Override
	public Medication findByNameAndDosage(String name, String dosage) {
		return medicationDao.findByNameAndDosage(name, dosage);
	}

	public List<Medication> findAll() {
		return medicationDao.findAll();
	}

	public Medication save(Medication medication) {
		return medicationDao.save(medication);
	}

	public Medication retrieveByName(String name) {
		return medicationDao.findByName(name);
	}

	public Optional<Medication> findById(Long medicationId) {
		return medicationDao.findById(medicationId);
	}

}
