package com.hackathon.centralsureveillanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.centralsureveillanceservice.modeldto.CentralDataDto;
import com.hackathon.centralsureveillanceservice.modeldto.ResponseDto;
import com.hackathon.centralsureveillanceservice.service.CentralSureveillanceService;


@RestController
@RequestMapping("/")
public class CentralController {

	@Autowired
	CentralSureveillanceService centralSureveillanceService;
	
	@PostMapping("/surveillance")
	public String addCentralSurveillance(@RequestBody CentralDataDto careReport) {
		return centralSureveillanceService.addCentralSurveillance(careReport);
	}
	
	@GetMapping("/analysisCount")
	public ResponseDto analysisCount() {
		return centralSureveillanceService.analysisCount();
	}
}
