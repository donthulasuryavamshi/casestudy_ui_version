package com.casestudy.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.casestudy.dbconnection.DataBaseConnector;
import com.casestudy.entities.LP1;
import com.casestudy.model.UserModel;
public class LpDAOImpl implements LpDAO {

	@Override
	public LP1 lpProfileView(String userId) throws ClassNotFoundException, SQLException {

		Connection connection=DataBaseConnector.initilizConnection();
	
		PreparedStatement statement=connection.prepareStatement("select lp_id,first_name,last_name,phone_number,email,role,city,state,country from lp_details_table where lp_id=?");
		UserModel userModel=new UserModel();
		statement.setString(1,userId);		
		ResultSet resultSet=statement.executeQuery();
		LP1 lp=new LP1();
		
	
	        while(resultSet.next()) {
	     
			lp.setLpId(resultSet.getString("lp_id"));
			lp.setFirstName(resultSet.getString("first_name"));
			lp.setLastName(resultSet.getString("last_name"));
			lp.setEmail(resultSet.getString("email"));
			lp.setPhoneNumber(resultSet.getString("phone_number"));
			lp.setRole(resultSet.getString("role"));
			lp.setCity(resultSet.getString("city"));
			lp.setState(resultSet.getString("state"));
			lp.setCountry(resultSet.getString("country"));
	        }
	       
	        DataBaseConnector.closeConnection();
		    return lp;
		
	}

	@Override
	public boolean storeLpDetails(LP1 lp) throws ClassNotFoundException, SQLException  {
		
		          boolean result=false;
		          Connection connection;
		
			  
				  connection = DataBaseConnector.initilizConnection();
			      PreparedStatement statement;
			
			
				   statement = connection.prepareStatement("UPDATE lp_details_table SET first_name=?,last_name=?,phone_number=?,email=?,role=?,city=?,state=?,country=? where lp_id=?");
			
			     
				   statement.setString(1, lp.getFirstName());
			       statement.setString(2, lp.getLastName());
			       statement.setString(3, lp.getPhoneNumber());
			       statement.setString(4, lp.getEmail());
			       statement.setString(5, lp.getRole());
			       statement.setString(6, lp.getCity());
			       statement.setString(7, lp.getState());
			       statement.setString(8, lp.getCountry());
				   statement.setString(9, lp.getLpId());
                   System.out.println(statement);
			   
			      int row=statement.executeUpdate();
			     
			      DataBaseConnector.closeConnection();
			       if(row>0)
			    	   
			    	  result=true;
			       else
			    	   return false;
			    	   
			       return result;
			      
		} 
		
		
	}

	
