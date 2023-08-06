package com.hackathon.analysisservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.analysisservice.service.AnalysisService;

@RestController
@RequestMapping("/")
public class AnalysisController {
	
	@Autowired
	AnalysisService analysisService;
	
	@GetMapping("/analysis")
	public String getAnalysis() {
		return analysisService.getAnalysis();
	}

}
