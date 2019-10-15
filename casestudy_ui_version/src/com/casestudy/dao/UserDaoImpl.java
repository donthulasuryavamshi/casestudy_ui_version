package com.casestudy.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import com.casestudy.dbconnection.DataBaseConnector;
public class UserDaoImpl implements UserDAO {

	public static Logger log = Logger.getLogger(UserDaoImpl.class.getName());


	
	@Override
	public boolean userAuth(String userId,String password) throws SQLException, ClassNotFoundException {
		
		
			Connection connection=DataBaseConnector.initilizConnection();
			boolean result=false;
			PreparedStatement statement = connection.prepareStatement("select lp_id,lp_password from lplogin where( lp_id=? and lp_password=?)");
			statement.setString(1, userId);
			statement.setString(2, password);
             
         
			
		    ResultSet resultSet=statement.executeQuery();
		 
             if(resultSet.next()) {
            	 
            	    result=true;
        		    log.info("User Logged in");
            	 
             }else {
            	 
            	 result=false;
     		    log.info("User Login Failed");

             }
		    
             DataBaseConnector.closeConnection();
			 return result;
				

}		
}

