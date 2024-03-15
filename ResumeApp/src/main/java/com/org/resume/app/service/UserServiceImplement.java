package com.org.resume.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.resume.app.UserRepostiory;
import com.org.resume.app.model.User;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	UserRepostiory repostiory;

	@Override
	public boolean addUserRecords(User user) {

		try {
			repostiory.save(user);
			return true;
		} catch (Exception ex) {
			System.out.println("error" + ex);
		}
		return false;
	}

}
