package com.hackathon.healthcareservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.healthcareservice.externalservice.CentralService;
import com.hackathon.healthcareservice.modeldto.HealthCareReport;

@Service
public class HealthCareService {
	
	@Autowired
	CentralService centralService;
	
	public String healthCareReport(HealthCareReport careReport) {
		return centralService.healthCareReport(careReport);
	}
}
