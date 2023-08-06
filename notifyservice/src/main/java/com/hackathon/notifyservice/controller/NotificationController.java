package com.hackathon.notifyservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.notifyservice.modeldto.NotificationData;
import com.hackathon.notifyservice.services.NotificationService;

@RestController
@RequestMapping("/")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@GetMapping("/greet")
	public String greeting() {
		return "notify";
	}
	
	@PostMapping("/notify")
	public boolean notification(@RequestBody NotificationData data) {
		return notificationService.sendNotification(data);
	}
}
