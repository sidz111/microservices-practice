package com.sidz.post_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sidz.post_service.entity.Posts;
import com.sidz.post_service.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsController {
	
	@Autowired
	PostsService postsService;
	
	@GetMapping("/get/{id}")
	public Posts getPosts(@PathVariable("id") Integer id) {
		return postsService.getPostById(id);
	}
}
