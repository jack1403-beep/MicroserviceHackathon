package com.hackathon.healthcareservice.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.hackathon.healthcareservice.modeldto.HealthCareReport;

@FeignClient(name = "centralsurveillanceservice")
public interface CentralService {
	
	@PostMapping("/Central/surveillance")
	public String healthCareReport(HealthCareReport careReport);
}
