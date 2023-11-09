package com.example.demo.service;
import com.example.demo.model.User;
import com.example.demo.repository.FacebookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacebookService {
	 @Autowired
	 private FacebookRepo facebookRepo;


	    public List<User> getAllUsers() {
	        return facebookRepo.findAll();
	    }

	    public User saveUser(User user) {
	        return facebookRepo.save(user);
	    }
}
