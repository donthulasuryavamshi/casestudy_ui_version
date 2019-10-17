package com.casestudy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class MentorViewDao implements MentorView  {
	Logger log = Logger.getLogger(AdminLoginAuthDao.class.getName());
	@Override
	public void viewMentorsListDao() {
		Connection con;
		try {
			con = com.casestudy.dbconnection.DataBaseConnector.initilizConnection();
			PreparedStatement ps = con.prepareStatement("select * from mentordetails ");
			ResultSet rs = ps.executeQuery();
			//System.out.println("in dao......");
			log.info("mentor details are viewed...");
			while(rs.next()) {
				System.out.println("_____________________________________________________________________________________________________________________________________________________________");
				System.out.println(rs.getString(1)+"  |"+rs.getString(2)+"  |"+rs.getString(3)+"  |"+rs.getDate(4)+"  |"+rs.getInt(5)+"  |"+rs.getString(6)+"  |"+rs.getString(7)+"  |"+rs.getString(8));
		}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}
}
