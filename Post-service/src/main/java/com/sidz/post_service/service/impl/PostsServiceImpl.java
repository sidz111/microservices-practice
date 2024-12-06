package com.sidz.post_service.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidz.post_service.entity.Posts;
import com.sidz.post_service.repository.PostsRepository;
import com.sidz.post_service.service.PostsService;

@Service
public class PostsServiceImpl implements PostsService{

	@Autowired
	PostsRepository postsRepository;
	
	@Override
	public Posts getPostById(Integer id) {
		Optional<Posts> post = postsRepository.findById(id);
		if(post.isEmpty()) {
			return null;
		}
		else {
			return post.get();
		}
	}

}
