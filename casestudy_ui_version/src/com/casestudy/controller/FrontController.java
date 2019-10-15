package com.casestudy.controller;
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
}