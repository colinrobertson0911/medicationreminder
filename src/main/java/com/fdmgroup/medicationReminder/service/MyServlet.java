package com.fdmgroup.medicationReminder.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.fdmgroup.medicationReminder.model.Medication;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
	
	@Autowired
	Medication medication;

	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 MedicationService medicationService = new MedicationService();
		 String button = request.getParameter("button");

	        if ("button1".equals(button)) {
	            medicationService.removePillsFromPillsLeft(medication.getPillsLeft(), medication.getMedicationId());
	            medicationService.refillReminder(medication.getPillsLeft(), medication.getMedicationId());
	        } 
	        request.getRequestDispatcher("WEB-INF/myMedication.jsp").forward(request, response);
	    }
}
