package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.fdmgroup.medicationReminder.model.Medication;
import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.MedicationService;
import com.fdmgroup.medicationReminder.service.PatientService;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class PatientServiceTest {

	@Autowired
	PatientService patientService;

	@Autowired
	MedicationService medicationService;

	@Test
	public void test_ThatAUserCanBeCreated() {
		Patient patient = new Patient();
		List<Medication> medication = medicationService.retrieveAll();
		medication.addAll(medication);
		patient.setUsername("robbo");
		patient.setPassword("password");
		patient.setName("Colin");
		patient.setWeight("81kg");
		patient.setHeight("81cm");
		patient.setAge(40);
		int numberBeforeAdding = patientService.retrieveAll().size();
		patientService.save(patient);
		System.out.println(patient);
		int numberAfterAdding = patientService.retrieveAll().size();
		assertNotEquals(numberAfterAdding, numberBeforeAdding);

	}

	@Test
	void test_FindByUsernameAndPasswordWhenUserExists() {
		Patient patient = patientService.findByUsernameAndPassword("pedro", "password");
		assertEquals(1, patient.getPatientId());
	}

	@Test
	public void test_WhenUnknownUserFindByUsernameAndPasswordWhenUserExists() {
		Patient patient = patientService.findByUsernameAndPassword("unknown", "password");
		assertNull(patient);
	}

	@Test
	public void test_WhenUnknownUserFindByUsernameWhenUserExists() {
		Patient patient = patientService.findByUsername("unknown");
		assertNull(patient);
	}

}
