package com.casestudy.services;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.casestudy.dao.UserDAO;
import com.casestudy.helper.FactoryUserDAO;
import com.casestudy.model.UserModel;
public class UserServiceImpl implements UserService {
	UserDAO userDAO = null;
	public UserServiceImpl() {
		this.userDAO = FactoryUserDAO.createUseDAO();
	}
	@Override
	public boolean userAuthenticationService(UserModel userModel) {
		boolean userValid = false;	
			try {
				userValid = userDAO.userAuth(userModel.getUserId(), userModel.getPassword());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return userValid;
	}
}

