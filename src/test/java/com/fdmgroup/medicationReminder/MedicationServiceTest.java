package com.fdmgroup.medicationReminder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;
import java.util.Optional;

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
		medication.setDosage("30mg");
		medication.setCondition(null);
		medication.setTimesAWeek(7);
		medication.setTimesADay(1);
		medication.setTimeToTake(null);
		medication.setQuantity(1);
		medication.setPillsLeft(30);
		int numberBeforeAdding = medicationService.findAll().size();
		medicationService.save(medication);
		int numberAfterAdding = medicationService.findAll().size();
		assertNotEquals(numberAfterAdding, numberBeforeAdding);

	}

	@Test
	public void test_ThatMedicationCanBeRetrievedUsingAnId() {
		Optional<Medication> medicationOpt = medicationService.retrieveById(2L);
		Medication medication = medicationOpt.get();
		assertEquals("Amlodipine", medication.getName());
	}

	@Test
	void test_findMedicationByNameAndDosage() {
		Medication medication = medicationService.findByNameAndDosage("Paracetamol", "250mg");
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
		List<Medication> allMedication = medicationService.findAll();
		int numberOfMedication = allMedication.size();
		assert (numberOfMedication > 0);

	}

	@Test
	public void test_ThatMedicationCanBeEdited() {
		Medication medication = medicationService.findByNameAndDosage("Paracetamol", "250mg");
		medication.setDosage("500mg");
		assertEquals("500mg", medication.getDosage());
	}
	
	@Test
	public void test_ThatPillsLeftIsCalculatedOnceTimeToTakeHasBeenReached() {
		int pillsLeft = medicationService.removePillsFromPillsLeft(100, 6L);
		assertNotEquals(pillsLeft, 100);
		
	}
	
	@Test
	public void test_IfPillsLeftDropsBelowCertainAmount_ItTriggersTheRefillReminder() {
		boolean refill = medicationService.refillReminder(6, 1L);
		assertEquals(refill, true);
	}

}
