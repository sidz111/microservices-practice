package com.sidz.notifications_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sidz.notifications_service.entity.Notifications;
import com.sidz.notifications_service.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@GetMapping("/get/{id}")
	public Notifications getNotification(@PathVariable("id") Integer id) {
		return notificationService.getNotificationById(id);
	}

}
