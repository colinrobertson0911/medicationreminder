package com.fdmgroup.medicationReminder.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.medicationReminder.model.Patient;
import com.fdmgroup.medicationReminder.service.PatientService;

@Controller
public class LoginController {

	public final static String SESSION_ATTRIBUTE_USER = "USER";
	private final static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	PatientService patientService;
	
	// For empty default url
	@GetMapping("")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("Login")
	public String login() {
		return "login.jsp";
	}
	
	@PostMapping("LoginSubmit")
	public ModelAndView loginSubmit(
			@ModelAttribute("patient")Patient patient,
			ModelMap model,
			HttpSession session) {
		
		Patient patientFromDatabase = patientService.findByUsernameAndPassword(patient.getUsername(), patient.getPassword());
		if (patientFromDatabase == null) {
			model.addAttribute("errorMessage", "Incorrect username or password");
			return new ModelAndView("login.jsp");
		}
		
		LOGGER.info("User {} logged in at {}", patient.getUsername(), LocalDateTime.now());
		session.setAttribute(SESSION_ATTRIBUTE_USER, patientFromDatabase);
		return new ModelAndView("/WEB-INF/main.jsp");
	}

	@GetMapping("Logout")
	public String logout(HttpSession session) {
		LOGGER.info("User {} logged out at {}", ((Patient) session.getAttribute(SESSION_ATTRIBUTE_USER)).getUsername(), LocalDateTime.now());
		session.invalidate();
		return "home.jsp";
	}
}


