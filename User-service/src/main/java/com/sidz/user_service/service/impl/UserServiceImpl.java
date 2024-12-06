package com.sidz.user_service.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidz.user_service.entity.User;
import com.sidz.user_service.repository.UserRepository;
import com.sidz.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(Integer id) {
		Optional<User> u = userRepository.findById(id);
		if(u.isEmpty()) {
			return null;
		}
		else {
			return u.get();
		}
	}

}
