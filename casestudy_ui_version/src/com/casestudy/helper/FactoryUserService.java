package com.casestudy.helper;
import com.casestudy.services.UserService;
import com.casestudy.services.UserServiceImpl;
public class FactoryUserService {
	public static UserService createUserService() {
		UserService userService = new UserServiceImpl();
		return userService;
		//UserDaoImpl userService = new UserDaoImpl();
//		return userService;

	}

}