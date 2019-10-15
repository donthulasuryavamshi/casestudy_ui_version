package com.casestudy.helper;
import com.casestudy.dao.UserDAO;
import com.casestudy.dao.UserDaoImpl;
public class FactoryUserDAO {

	public static UserDAO createUseDAO() {

		UserDAO userDAO = new UserDaoImpl();

		return userDAO;

	}
}
