package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.fdmgroup.medicationReminder.model.Medication;
import com.fdmgroup.medicationReminder.service.MedicationService;


@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class MedicationServiceTest {
	
	@Autowired
	MedicationService medicationService;

	@Test
	void test_findMedicationByNameAndDosage() {
		Medication medication = medicationService.findByNameAndDosage("Paracetamol", 250);
		assertEquals(1, medication.getMedicationId());
	}

}
