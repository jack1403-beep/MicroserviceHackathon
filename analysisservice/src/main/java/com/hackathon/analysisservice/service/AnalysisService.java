package com.hackathon.analysisservice.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.analysisservice.commonservice.AnalysisCount;
import com.hackathon.analysisservice.commonservice.NotifyService;
import com.hackathon.analysisservice.modeldto.NotificationData;
import com.hackathon.analysisservice.modeldto.ResponseDto;

@Service
public class AnalysisService {

	
	@Autowired
	AnalysisCount analysisCount;
	
	@Autowired
	NotifyService notifyService;
	
	
	public String getAnalysis() {
		String response;
		int flag = 0;
		ResponseDto result = analysisCount.analysisCounts();
		NotificationData data = new NotificationData();
		for(Map.Entry<String, Long> i : result.getDiseaseName().entrySet()) {
			data.setDiseaseName(i.getKey());
			data.setCount(i.getValue());
			notifyService.notification(data);
			flag = 1;
		}
		if(flag==0) {
			response = "Dieases are not spreading";
		}else {
			response = "notification sent successfully";
		}
//		boolean notificationResult = false;
//		if(result) {
//			notificationResult = notifyService.notification();
//		}
//		
//		if(notificationResult) {
//			response = "notification sent successfully";
//		}else {
//			response = "Dieases are not spreading";
//		}
		return response;
	}

}
