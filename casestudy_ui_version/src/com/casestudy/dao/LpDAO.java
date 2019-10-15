package com.casestudy.dao;

//package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.casestudy.entities.LP1;


public interface LpDAO{
	
	
     LP1 lpProfileView(String userId) throws ClassNotFoundException, SQLException;


	boolean storeLpDetails(LP1 lp) throws ClassNotFoundException, SQLException;

	
}

