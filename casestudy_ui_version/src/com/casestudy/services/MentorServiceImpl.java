package com.casestudy.services;

import java.sql.SQLException;

import com.casestudy.dao.MentorDAO;
import com.casestudy.helper.FactoryMentorDAO;
import com.casestudy.model.MentorModel;

public class MentorServiceImpl implements MentorService {
	
	MentorDAO mentorDAO=null;
	
	public MentorServiceImpl(){
		
		this.mentorDAO=FactoryMentorDAO.createMentorDAO();
		
	}
	@Override
	public boolean mentorAuthenticationService(MentorModel mentorModel) {
		// TODO Auto-generated method stub
		boolean mentorValid = false;
		try {
			mentorValid=mentorDAO.mentorAuth(mentorModel.getMentorId(), mentorModel.getMentorPassword());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mentorValid;
		
	}
}


