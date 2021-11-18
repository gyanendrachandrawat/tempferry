package com.example.training1.springbootdemo.service;

import com.example.training1.springbootdemo.models.User;
import com.example.training1.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

}

