package com.casestudy.dao;

//package com.virtusa.dao;

import java.sql.SQLException;



public interface UserDAO {
	public boolean userAuth(String userId,String password) throws SQLException, ClassNotFoundException;

	
}

