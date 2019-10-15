package com.casestudy.view;

import java.util.Scanner;

import com.casestudy.controller.AdminController;

public class AdminLoginView {
	public void loginForm() {
		try(
				Scanner sc = new Scanner(System.in);){
			System.out.println("=======  Login Form===========");
			System.out.print("username: ");
			String username = sc.next();
			System.out.print("\npassword ");
			String password = sc.next();
			System.out.println("==============================");
			if(username!=null && password!=null) {
				AdminController ac = new AdminController();
				ac.authValidation(username,password);
				//System.out.println(username+ "  "+password);//debugging
			}else {
				System.out.println("  invalid username or password");
				//System.out.println("==============================");
				AdminLoginView alv = new AdminLoginView();
				alv.loginForm();
			}
		}
		
	}
}
