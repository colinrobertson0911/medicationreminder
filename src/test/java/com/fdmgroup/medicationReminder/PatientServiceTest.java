package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

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
		patient.setUsername("robbo");
		patient.setPassword("password");
		patient.setName("Colin");
		patient.setWeight("81kg");
		patient.setHeight("81cm");
		patient.setAge(40);
		int numberBeforeAdding = patientService.findAll().size();
		patientService.save(patient);
		int numberAfterAdding = patientService.findAll().size();
		assertNotEquals(numberAfterAdding, numberBeforeAdding);

	}

	@Test
	void test_FindByUsernameAndPasswordWhenUserExists() {
		Patient patient = patientService.findByUsernameAndPassword("pedro01", "password").get();
		assertEquals(1, patient.getPatientId());
	}

	@Test
	public void test_WhenUnknownUserFindByUsernameAndPasswordWhenUserExists() {
		Optional<Patient> patient = patientService.findByUsernameAndPassword("unknown", "password");
		assertTrue(patient.isEmpty());
	}

	@Test
	public void test_WhenUnknownUserFindByUsernameWhenUserExists() {
		Optional<Patient> patient = patientService.findByUsername("unknown");
		assertTrue(patient.isEmpty());
	}

	@Test
	public void test_ThatAPatientCanBeEdited() {
		Patient patient = patientService.findByUsername("pedro01").get();
		patient.setWeight("90kg");
		assertEquals("90kg", patient.getWeight());
	}

	@Test
	public void test_ThatAPatientsListOfMedicationCanBeRetrieved() {
		Patient patient = patientService.findById(1L).get();
		List<Medication> medication = medicationService.findAll();
		patient.getMedication();
		int numberOfMedication = medication.size();
		assert (numberOfMedication > 0);
	}

}
