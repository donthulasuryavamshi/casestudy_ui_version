package com.casestudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.casestudy.model.LPRegisterModel;

public class LPRegisterDao implements LpRegister {
	Logger log = Logger.getLogger(LPRegisterDao.class.getName());
	@Override
	public void lpDetailsFilling(LPRegisterModel lprm) {
		try {
		Connection con = com.casestudy.dbconnection.DataBaseConnector.initilizConnection();
		PreparedStatement ps = con.prepareStatement("insert into lpdetails (lp_id, first_name, last_name, dob, phone_number, email, designation ) values (?,?,?,?,?,?,?) ");
		ps.setString(1, lprm.getLP_ID());
		ps.setString(2, lprm.getFirst_Name());
		ps.setString(3, lprm.getLast_Name());
		
		LocalDate dob=lprm.getDOB();
		java.sql.Date dOB = new java.sql.Date(dob.getYear(),dob.getMonthValue(),dob.getDayOfMonth());
		ps.setDate(4,dOB);
		//ps.setDate(4, dob);
		
		ps.setInt(5, lprm.getPhone_Number());
		ps.setString(6, lprm.getEmail());
		ps.setString(7,lprm.getRole());
		
		int rs = ps.executeUpdate();
		if(rs ==  1) {
			log.info(lprm.getLP_ID()+" has been enrolled successfully");
			System.out.println(" inserted successfully ");
		}else {
			System.out.println(" error in insert query ");
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//String batch_id = lprm.getBatch_Id();
		//String first_name = lprm.getFirst_Name();
		//String last_name = lprm.getLast_Name();
		
		//String dob = lprm.getDOB();
//		LocalDate dob=lprm.getDOB();
//		java.sql.Date hireDate=new java.sql.Date(dob.getYear(),dob.getMonthValue(),dob.getDayOfMonth());
//		LocalDate dOB = lprm.setDOB(dOB);
		
		//int phone_number = lprm.getPhone_Number();
		//String email = lprm.getEmail();
		//String designation = lprm.getRole();
		//System.out.println("jdbc");
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try(
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
				){
			PreparedStatement ps = con.prepareStatement("insert into lp (lp_id, first_name, last_name, dob, phone_number, email, role ) values (?,?,?,?,?,?,?) ");
			ps.setString(1, lprm.getLP_ID());
			ps.setString(2, lprm.getFirst_Name());
			ps.setString(3, lprm.getLast_Name());
			
			LocalDate dob=lprm.getDOB();
			java.sql.Date dOB = new java.sql.Date(dob.getYear(),dob.getMonthValue(),dob.getDayOfMonth());
			ps.setDate(4,dOB);
			//ps.setDate(4, dob);
			
			ps.setInt(5, lprm.getPhone_Number());
			ps.setString(6, lprm.getEmail());
			ps.setString(7,lprm.getRole());
			
			int rs = ps.executeUpdate();
			if(rs ==  1) {
				System.out.println(" inserted successfully ");
			}else {
				System.out.println(" error in insert query ");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
	}
}