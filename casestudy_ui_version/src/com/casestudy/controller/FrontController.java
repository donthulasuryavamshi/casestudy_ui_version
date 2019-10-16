package com.casestudy.controller;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.casestudy.client.UserLogin;
import com.casestudy.services.LoginService;
public class FrontController {
static Logger log = Logger.getLogger(FrontController.class.getName());
  public void loginview() {
	  log.info("entered loginservices");
	  LoginService ls = new LoginService();
	  ls.loginViewService();
  }
  public void lpLoginView() {
	  log.info("lp login detected!!!");
	 // UserLogin userLogin = new UserLogin();
	  UserLogin.loginMenu();
  }
  public void mentorLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Mentor Id:");
		String mentorId=scanner.next();
		System.out.println("Enter Password:");
		String mentorPassword=scanner.next();		
		MentorController mentorController=new MentorController();
		mentorController.mentorAuthentication(mentorId, mentorPassword);
		scanner.close();
	}
}