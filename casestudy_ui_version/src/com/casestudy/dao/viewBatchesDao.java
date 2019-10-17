package com.casestudy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class viewBatchesDao implements ViewBatch{
	public void viewBatchesDetails() {
		try {
		Connection con = com.casestudy.dbconnection.DataBaseConnector.initilizConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from batch");
		//System.out.println("-----------------------------------");
		while(rs.next()) {
			/*System.out.println("<html><table border='1' align='center'><tr> "
					+ "<td><th>BATCH_ID</th></td>"
					+ "<td><th>BATCH_NAME</th></td>"
					+ "<td><th>BATCH_CAPACITY</th></td>"
					+ "<td><th>BATCH_MENTOR_ID</th></td>"
					+ "<td><th>BATCH_VENUE_ID</th></td>"
					+ "<td><th>BATCH_START_DATE</th></td>"
					+ "<td><th>BATCH_END_DATE</th></td>"
					+ "</tr>");
			System.out.println("in view batch dao executinggg");*/
			System.out.println(rs.getString(1) +" | "+rs.getString(2)+" | "+rs.getInt(3)+ " | "+rs.getInt(4)+" | "+rs.getString(5)+" | "+rs.getDate(6)+ " | "+rs.getDate(7));
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

}
}
