package com.casestudy.controller;
import com.casestudy.view.AdminOperation;
import com.casestudy.view.MainLoginForm;
public class LoginController {
	public void adminLoginSuccessful() {
		System.out.println("authentication successfull");
		AdminOperation ao = new AdminOperation();
		ao.viewmenu();
	}
	public void adminLoginUnSuccessful() {
		System.out.println("authentication failed!!!");
		System.out.println("=====Resons for failure==========");
		System.out.println("  you may have mistyped username or password");
		System.out.println("  you may not be authorized to login here!!!");
		MainLoginForm.menu();
	}
}