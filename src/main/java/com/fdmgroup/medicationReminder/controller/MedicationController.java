package com.fdmgroup.medicationReminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.medicationReminder.model.Medication;
import com.fdmgroup.medicationReminder.service.MedicationService;

@Controller
public class MedicationController {

	@Autowired
	private MedicationService medicationService;

	@GetMapping("AllMedication")
	public ModelAndView allMedication() {
		return new ModelAndView("WEB-INF/allMedication.jsp", "allMedication", medicationService.findAll());
	}

	@GetMapping("AddMedication")
	public ModelAndView addMedication() {
		return new ModelAndView("WEB-INF/addMedication.jsp", "medication", new Medication());
	}

	@PostMapping("AddMedicationSubmit")
	public ModelAndView addMedicationSubmit(@ModelAttribute("medication") Medication medication) {
		medicationService.save(medication);
		return new ModelAndView("WEB-INF/allMedication.jsp", "allMedication", medicationService.findAll());
	}

	@GetMapping("EditMedication")
	public ModelAndView editMedication(@RequestParam("id") Long id) {
		return new ModelAndView("WEB-INF/editMedication.jsp", "medication", medicationService.retrieveById(id));
	}

	@PostMapping("EditMedicationSubmit")
	public ModelAndView editMedicationSubmit(@ModelAttribute("medication") Medication medication) {
		medicationService.save(medication);
		return new ModelAndView("WEB-INF/allMedication.jsp", "allMedication", medicationService.findAll());
	}

}
