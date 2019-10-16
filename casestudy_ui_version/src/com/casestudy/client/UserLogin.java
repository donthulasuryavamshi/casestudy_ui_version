package com.casestudy.client;

//package com.virtusa.client;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.casestudy.controller.UserController;

//import com.virtusa.controller.UserController;



public class UserLogin {
	
	//public static Logger log = Logger.getLogger(UserLogin.class.getName());
	//public static void main(String[] args) {
	//log.info("Main Method Stared");
	//UserLogin.loginMenu();
	//}
	public static void loginMenu() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id:");
		String userId=sc.next();
		System.out.println("Enter Password:");
		String password=sc.next();
		
		UserController userController=new UserController();
		userController.userAuthentication(userId, password);
		
		
	}
	
	public static void invalidLogin() {
		
		System.out.println("Invalid Username or Password");
		loginMenu();
	}

}

