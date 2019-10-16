package com.casestudy.services;

import com.casestudy.model.MentorModel;

public interface MentorService {


	 default boolean mentorAuthenticationService(MentorModel mentorModel) {
		return false;
	}
}


