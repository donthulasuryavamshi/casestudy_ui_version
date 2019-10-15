package com.casestudy.junit;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.casestudy.dbconnection.DataBaseConnector;

public class DBConnectionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitilizConnection() {
		try {
			Connection connection=DataBaseConnector.initilizConnection();
			assertEquals(true,connection!=null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	}
	@Test
	public void testCloseConnection() throws ClassNotFoundException, SQLException {
		Connection connection = DataBaseConnector.initilizConnection();
		assertEquals(false, connection==null);
	}
	
}
