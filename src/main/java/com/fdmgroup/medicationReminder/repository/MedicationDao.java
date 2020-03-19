package com.fdmgroup.medicationReminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.fdmgroup.medicationReminder.model.Medication;

public interface MedicationDao extends JpaRepository<Medication, Long> {

	Medication findByNameAndDosage(@Param("name") String name, @Param("dosage") String dosage);

	Medication findByName(@Param("name") String name);

	Medication findByMedicationId(@Param("medicationId") long medicationId);

}
