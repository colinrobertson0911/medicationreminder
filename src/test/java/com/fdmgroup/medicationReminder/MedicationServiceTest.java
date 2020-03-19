package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalTime;
import java.util.List;

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
	public void test_ThatMedicationCanBeCreated() {
		Medication medication = new Medication();
		medication.setName("Meloxicam");
		medication.setDosage(30);
		medication.setCondition(null);
		medication.setTimesAWeek(7);
		medication.setTimesADay(1);
		medication.setTimeToTake(LocalTime.parse("09:00"));
		medication.setQuantity(1);
		medication.setPillsLeft(30);
		int numberBeforeAdding = medicationService.retrieveAll().size();
		medicationService.save(medication);
		int numberAfterAdding = medicationService.retrieveAll().size();
		assertNotEquals(numberAfterAdding, numberBeforeAdding);

	}

	@Test
	public void test_ThatMedicationCanBeRetrievedUsingAnId() {
		Medication medication = medicationService.retrieveByMedicationId(1);
		System.out.println(medication);
		Medication medicationFromDatabase = medicationService.retrieveByMedicationId(medication.getMedicationId());
		assertEquals(medication, medicationFromDatabase);
	}

	@Test
	void test_findMedicationByNameAndDosage() {
		Medication medication = medicationService.findByNameAndDosage("Paracetamol", 250);
		assertEquals(1, medication.getMedicationId());
	}

	@Test
	public void test_ThatMedicationCanBeRetrievedByName() {
		Medication medication = medicationService.retrieveByName("Paracetamol");
		Medication medicationFromDatabase = medicationService.retrieveByName(medication.getName());
		assertEquals(medication, medicationFromDatabase);
	}

	@Test
	public void test_ThatAListOfMedicationCanBeRetrieved() {
		List<Medication> allMedication = medicationService.retrieveAll();
		int numberOfMedication = allMedication.size();
		assert (numberOfMedication > 0);

	}

}
