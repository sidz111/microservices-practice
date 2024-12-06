package com.sidz.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sidz.user_service.entity.Notifications;
import com.sidz.user_service.entity.Posts;
import com.sidz.user_service.entity.User;
import com.sidz.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		Posts post = restTemplate.getForObject("http://localhost:8082/posts/get/1", Posts.class);
		Notifications notifications = restTemplate.getForObject("http://localhost:8083/notification/get/1", Notifications.class);
		User u = userService.getUserById(id);
		u.setPosts(post);
		u.setNotifications(notifications);
		
		return u;
	}

}
