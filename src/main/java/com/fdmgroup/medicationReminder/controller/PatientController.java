package com.fdmgroup.medicationReminder.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.MedicationService;
import com.fdmgroup.medicationReminder.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private MedicationService medicationService;
	
	
	
	@RequestMapping("AllPatients")
	public ModelAndView allPatients() {
		return new ModelAndView("WEB-INF/allPatients.jsp", "allPatients", patientService.findAll());
	}
	
	@RequestMapping("AddPatient")
	public ModelAndView addPatient() {
		ModelAndView modelAndView = new ModelAndView("WEB-INF/addPatient.jsp");
		modelAndView.addObject("patient", new Patient());
		modelAndView.addObject("allMedication", medicationService.findAll());
		return modelAndView;
	}
	
	@PostMapping("AddPatientSubmit")
	public ModelAndView addPatientSubmit(@ModelAttribute("patient")Patient patient) {
		patientService.save(patient);
		return new ModelAndView("forward:/AllPatients");
	}
	
	@RequestMapping("EditPatient")
	public ModelAndView editPatient(@RequestParam("id")Long id) {
		Optional<Patient> patient = patientService.findById(id);
		if (patient.isEmpty()) {
			
		}
		ModelAndView modelAndView = new ModelAndView("WEB-INF/editPatient.jsp", "patient", patient.get());
		return modelAndView;
	}
	
	@PostMapping("EditPatientSubmit")
	public ModelAndView editPatientSubmit(@ModelAttribute("patient")Patient patient) {
		patientService.save(patient);
		return new ModelAndView("forward:/AllPatients");
	}
	
	@RequestMapping("MyMedication")
	public ModelAndView myMedication(@RequestParam("patientId")Long patientId, HttpSession session) {
		session.getAttribute("patientId");
		Patient patient = patientService.findById(patientId).get();
		patient.getMedication();
		ModelAndView modelAndView = new ModelAndView("WEB-INF/myMedication.jsp", "allMedication", patient.getMedication());
		return modelAndView;
	}
	
	@PostMapping("TookMyMedication")
	public ModelAndView tookMyMedication(@ModelAttribute("patient") Patient patient) {
		patientService.save(patient);
		return new ModelAndView("forward:/MyMedication");
	}
}
