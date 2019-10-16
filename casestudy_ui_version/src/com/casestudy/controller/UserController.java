package com.casestudy.controller;
import com.casestudy.client.UserLogin;
import com.casestudy.helper.FactoryUserService;
import com.casestudy.model.UserModel;
import com.casestudy.services.UserService;
import com.casestudy.view.LpView;
public class UserController {

	UserService userService;

	public UserController() {

		this.userService = FactoryUserService.createUserService();
	}

	public final void userAuthentication(String userId, String password) {

		UserModel userModel = new UserModel();
		userModel.setUserId(userId);
		userModel.setPassword(password);

		boolean userType = userService.userAuthenticationService(userModel);
		if (userType == true) {

			LpView lpView = new LpView();
			lpView.lpMenu(userModel.getUserId());

		} else {
			UserLogin userLogin = new UserLogin();
			userLogin.invalidLogin();
		}

	}
}

