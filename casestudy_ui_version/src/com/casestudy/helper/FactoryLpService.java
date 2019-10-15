package com.casestudy.helper;
import com.casestudy.services.LpService;
import com.casestudy.services.LpServiceImpl;
public class FactoryLpService {

	public static LpService createLpService() {
		LpService lpService = new LpServiceImpl();

		return lpService;

	}

}
