package com.casestudy.controller;

import com.casestudy.model.LPRegisterModel;
import com.casestudy.services.AdminServices;

public class LPEnrollmentController {

	public void registerLPDetails(LPRegisterModel lprm) {
		AdminServices as = new AdminServices();
		as.lpDetails(lprm);
		
	}
}
