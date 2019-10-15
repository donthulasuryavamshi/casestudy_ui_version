package com.casestudy.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.casestudy.model.LPRegisterModel;
import com.casestudy.services.AdminServicesInterface;

public class AdminProfileDao implements AdminProfile {
	public AdminServicesInterface asi;
	public Logger log = Logger.getLogger(AdminLoginAuthDao.class.getName());
	@Override
	public void viewMyProfile() {

		try {
		Connection con = com.casestudy.dbconnection.DataBaseConnector.initilizConnection();
		PreparedStatement ps = con.prepareStatement("select * from admindetails");
		ResultSet rs = ps.executeQuery();
		//log.info(rs.getString(2)+rs.getString(3)+ "  has viwes the admin details");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("| MY ID  |  FIRST NAME  |  LAST NAME  |  DATE OF BIRTH  |          EMAIL ID         |  DESIGNATION  |");
		while(rs.next()) {
			System.out.println("");
			System.out.println(" | "+rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getDate(4)+" | "+rs.getString(5)+" | "+rs.getString(6));
		}
				
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
				) {
			PreparedStatement ps = con.prepareStatement("select * from admin");
			ResultSet rs = ps.executeQuery();
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println("| MY ID  |  FIRST NAME  |  LAST NAME  |  DATE OF BIRTH  |          EMAIL ID         |  DESIGNATION  |");
			while(rs.next()) {
				System.out.println(" | "+rs.getString(0)+" | "+rs.getString(1)+" | "+rs.getString(3)+" | "+rs.getDate(4)+" | "+rs.getString(5)+" | "+rs.getString(6));
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			/*PreparedStatement ps = con.prepareStatement("select * from lp");
			ResultSet rs = ps.executeQuery();
			System.out.println("LP_ID  |  FIRST_NAME |  LAST_NAME | DOB | PHONE_NUMBER | EMAIL | ROLE | BATCH_ID");
			while(rs.next()) {
				System.out.println(rs.getString(1)+ "    | " +rs.getString(2)+ "   | " + rs.getString(3)+"      | "+rs.getString(4)+"     | "+rs.getString(5)+"    | "+rs.getString(6)+"    | "+rs.getString(7)+"    | "+rs.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/

		
	}
}