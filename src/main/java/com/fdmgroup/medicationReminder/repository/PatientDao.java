package com.fdmgroup.medicationReminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.fdmgroup.medicationReminder.model.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {

	Patient findByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
	
	Patient findByUsername(@Param("username") String username);

}
