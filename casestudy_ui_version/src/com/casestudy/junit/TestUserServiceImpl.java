package com.casestudy.junit;
	import static org.junit.Assert.*;

import java.sql.SQLException;
	import org.junit.Test;

import com.casestudy.dao.UserDAO;
import com.casestudy.dao.UserDaoImpl;
	public class TestUserServiceImpl {


		@Test
		public void userLogin_positive() {
			UserDAO userDAO = new UserDaoImpl();
			try {
				boolean a = userDAO.userAuth("1", "lp");
				assertEquals(true, a);
			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}

		}

		@Test
		public void userLogin_negative() {
			UserDAO userDAO = new UserDaoImpl();
			try {
				boolean a = userDAO.userAuth("1", "jk");
				assertEquals(false, a);
			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}

		}


	}

