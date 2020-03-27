package com.fdmgroup.medicationReminder.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.PatientService;

@Controller
public class RegisterController {

	@Autowired
	PatientService patientService;

	@GetMapping("Register")
	public String register() {
		return "register.jsp";
	}

	@PostMapping("RegisterSubmit")
	public String registerSubmit(@ModelAttribute("patient") Patient patient, ModelMap model) {

		Optional<Patient> patientFromDatabase = patientService.findByUsername(patient.getUsername());
		if (patientFromDatabase.isPresent()) {
			model.addAttribute("errorMessage", "User already exists");
			return "register.jsp";
		}
		patientService.save(patient);
		return "login.jsp";
	}

}
