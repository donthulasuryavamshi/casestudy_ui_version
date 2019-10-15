package com.casestudy.dbconnection;

//package com.virtusa.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.casestudy.view.MainLoginForm;

public class DataBaseConnector {
	private static DbModdel dbmodel= new DbModdel();
	private static Connection con =null; 
	static Logger log= Logger.getLogger(DataBaseConnector.class.getName());
	public static Connection initilizConnection() throws ClassNotFoundException, SQLException {
		log.info("database connection connector is used");
		Class.forName(dbmodel.getDriver());
		con = DriverManager.getConnection(dbmodel.getUrl(),dbmodel.getUsername(),dbmodel.getPassword());
		return con;
		
		
	}
	public static void closeConnection() throws SQLException {
		con.close();
	}
	

}
