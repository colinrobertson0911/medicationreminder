package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.PatientService;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class PatientServiceTest {
	
	@Autowired
	PatientService patientService;
	
	@Test
	void test_WhenKnownUserFindByUsernameAndPasswordWhenUserExists() {
		Patient patient = patientService.findByUsernameAndPassword("pedro", "password");
		System.err.println(patient);
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
	
	
	@Test
	public void test_ThatAUserCanBeCreated() {
		Patient patient = new Patient("robbo", "password", "Colin", "81kg", "180cm", 40, null);
		int numberBeforeAdding = patientService.retrieveAll().size();
		patientService.save(patient);
		int numberAfterAdding = patientService.retrieveAll().size();
		assertNotEquals(numberAfterAdding, numberBeforeAdding);

	}

}
