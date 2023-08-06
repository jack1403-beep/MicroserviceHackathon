package com.hackathon.analysisservice.commonservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.hackathon.analysisservice.modeldto.NotificationData;

@FeignClient(name = "notificationservice")
public interface NotifyService {
	
	@GetMapping("/notify")
	public boolean notification(NotificationData data);

}
