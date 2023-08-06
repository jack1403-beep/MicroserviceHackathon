package com.hackathon.analysisservice.commonservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.hackathon.analysisservice.modeldto.ResponseDto;


@FeignClient(name = "centralsurveillanceservice")
public interface AnalysisCount {
	
	@GetMapping("/analysisCount")
	public ResponseDto analysisCounts();
}
