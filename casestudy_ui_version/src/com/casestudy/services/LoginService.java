package com.casestudy.services;
import com.casestudy.controller.LoginController;
import com.casestudy.view.AdminLoginView;
public class LoginService {
  public void loginViewService() {
	AdminLoginView alv = new AdminLoginView();
	alv.loginForm();
  }
  public void loginSuccessMessage() {
		//System.out.println("authenticated successfully");
		LoginController lsc = new LoginController();
		lsc.adminLoginSuccessful();
	}
	public void loginUnSuccessMessage() {
		//System.out.println("unsuccessful authentication");
		LoginController lsc = new LoginController();
		lsc.adminLoginUnSuccessful();
	}
}
