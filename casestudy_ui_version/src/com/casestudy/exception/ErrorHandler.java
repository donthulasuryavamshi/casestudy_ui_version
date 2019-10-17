package com.casestudy.exception;

import com.casestudy.view.MainLoginForm;

public class ErrorHandler {
	public void errors()  {
		System.out.println(" system has logout due to some internal issues  !!!!!!!");
		MainLoginForm.menu();
	}
}
