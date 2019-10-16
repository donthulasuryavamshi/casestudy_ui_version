package com.casestudy.helper;

import com.casestudy.services.MentorService;
import com.casestudy.services.MentorServiceImpl;

public class FactoryMentorService {
	public static MentorService createMentorService() {		
		MentorService mentorService=new MentorServiceImpl();
	return mentorService;

}
	
}

