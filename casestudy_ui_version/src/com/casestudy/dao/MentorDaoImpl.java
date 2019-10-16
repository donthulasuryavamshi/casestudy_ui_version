package com.casestudy.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.casestudy.dbconnection.DataBaseConnector;
public  class MentorDaoImpl implements MentorDAO {

	@Override
	public boolean mentorAuth(String mentorId,String mentorPassword) throws SQLException, ClassNotFoundException {
		
			Connection connection=DataBaseConnector.initilizConnection();
			PreparedStatement statement = connection.prepareStatement("select mentor_id, mentor_Password from mentorLogin where mentor_Id=? and mentor_Password=?");
			statement.setString(1, mentorId);
			statement.setString(2,mentorPassword);
 			ResultSet results=statement.executeQuery();
			//ResultSet results=statement.executeQuery();
			//System.out.println(results);
			 if(results.next()) {
				DataBaseConnector.closeConnection();
				 return true;
			 }else {
				// System.out.println("false");
				 return false;
			 } 
	}
			
}
