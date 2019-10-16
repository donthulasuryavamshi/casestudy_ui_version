package com.casestudy.view;
import java.util.Scanner;
import com.casestudy.controller.FrontController;
public class MainLoginForm {
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		System.out.println("===============================");
		System.out.println("==========LOGIN MENU===========");
		System.out.println("     LOGIN as ADMIN            ");
		System.out.println("     LOGIN as LP               ");
		System.out.println("     LOGIN as MENTOR           ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int option = sc.nextInt();
			FrontController fc = new FrontController();
			switch(option) {
		
			case 1:
				fc.loginview();
				break;
			case 2:
				fc.lpLoginView();
				break;
			case 3:
				fc.mentorLogin();
				break;
			default:
				System.out.println("select an valid option to proceed!!");
				MainLoginForm.menu();
			}
		sc.close();
	}else {
		System.out.println("please enter valid options as '1' or '2' or '3'");
		menu();
	}
	}
}