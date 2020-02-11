package com.bridgelabz.loginreg.serviceimplementation;

import com.bridgelabz.loginreg.repository.UserRepository;
import com.bridgelabz.loginreg.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean authentication(String name, String password) {

		return UserRepository.authentication(name, password);
	}

}
