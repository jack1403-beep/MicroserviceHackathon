package com.hackathon.healthcareservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.healthcareservice.modeldto.HealthCareReport;
import com.hackathon.healthcareservice.services.HealthCareService;

@RestController
@RequestMapping("/")
public class HealthCareController {
	
	@Autowired
	HealthCareService healthCareService;
	
	@PostMapping("/report")
	public String healthCareReport(@RequestBody HealthCareReport careReport) {
		return healthCareService.healthCareReport(careReport);
	} 

}
