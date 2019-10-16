package com.casestudy.helper;

import com.casestudy.dao.MentorDAO;
import com.casestudy.dao.MentorDaoImpl;

public class FactoryMentorDAO {

	public static MentorDAO createMentorDAO() {
		MentorDAO mentorDAO=new MentorDaoImpl();
		return mentorDAO;
	}

}


