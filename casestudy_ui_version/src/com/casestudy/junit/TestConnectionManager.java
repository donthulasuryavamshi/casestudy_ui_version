package com.casestudy.junit;
import static org.junit.Assert.*;
import org.junit.Test;
import com.casestudy.dbconnection.DataBaseConnector;
import java.sql.Connection;
	import java.sql.SQLException;

//import com.virtusa.integrate.ConnectionManager;

	public class TestConnectionManager {

		@Test
		public void testOpenConnection_positive() {
			try {
				Connection connection = DataBaseConnector.initilizConnection();//ConnectionManager.openConnection();
				assertEquals(true, connection != null);
			} catch (ClassNotFoundException | SQLException e) {
				assertTrue(false);
			}

		}

	}

