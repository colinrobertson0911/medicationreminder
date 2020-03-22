package com.fdmgroup.medicationReminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("AllPatients")
	public ModelAndView allPatients() {
		return new ModelAndView("WEB-INF/allPatients.jsp", "allPatients", patientService.findAll());
	}
	
	@GetMapping("AddPatient")
	public ModelAndView addPatient() {
		return new ModelAndView("WEB-INF/addPatient.jsp", "patient", new Patient());
	}
	
	@PostMapping("AddPatientSubmit")
	public ModelAndView addPatientSubmit(@ModelAttribute("patient")Patient patient) {
		patientService.save(patient);
		return new ModelAndView("WEB-INF/allPatients.jsp", "allPatients", patientService.findAll());
	}
	
	@GetMapping("EditPatient")
	public ModelAndView editPatient(@RequestParam("id")Long id) {
		return new ModelAndView("WEB-INF/editPatient.jsp", "patient", patientService.findById(id));
	}
	
	@PostMapping("EditPatientSubmit")
	public ModelAndView editPatientSubmit(@ModelAttribute("patient")Patient patient) {
		patientService.save(patient);
		return new ModelAndView("WEB-INF/allPatient.jsp", "allPatient", patientService.findAll());
	}
	
	
}
