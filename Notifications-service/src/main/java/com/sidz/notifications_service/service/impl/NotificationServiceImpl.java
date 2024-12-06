package com.sidz.notifications_service.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidz.notifications_service.entity.Notifications;
import com.sidz.notifications_service.repository.NotificationRepository;
import com.sidz.notifications_service.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationRepository notificationRepository;

	@Override
	public Notifications getNotificationById(Integer id) {
		Optional<Notifications> notification = notificationRepository.findById(id);
		if(notification.isEmpty()) {
			return null;
		}
		else {
			return notification.get();
		}
	}
	
	

}
