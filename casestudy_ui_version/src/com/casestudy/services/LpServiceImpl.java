package com.casestudy.services;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.casestudy.dao.LpDAO;
import com.casestudy.entities.LP1;
import com.casestudy.helper.FactoryLpDAO;
import com.casestudy.model.LpModel;
import com.casestudy.model.UpdateLpDetailsModel;
public class LpServiceImpl implements LpService {

	LpDAO lpDao;

	public LpServiceImpl() {

		this.lpDao = FactoryLpDAO.createLpDAO();

	}

	@Override
	public LpModel retrieveLpDetails(String userId) {

		LP1 lp = null;
		LpModel lpModel = new LpModel();
		try {
			lp = lpDao.lpProfileView(userId);
			lpModel.setFullName(lp.getFirstName() + " " + lp.getLastName());
			lpModel.setContactDetails("Email:" + lp.getEmail() + " Phone Number:" + lp.getPhoneNumber());
			lpModel.setRole(lp.getRole());
			lpModel.setAddress("City:" + lp.getCity() + "State: " + lp.getState() + "Country:" + lp.getCountry());
            lpModel.setId("ID:"+lp.getLpId());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return lpModel;
	}

	@Override
	public boolean storeLpService(UpdateLpDetailsModel updateModel) throws ClassNotFoundException, SQLException {

		LP1 lp = new LP1();
		lp.setFirstName(updateModel.getFirstName());
		lp.setLastName(updateModel.getLastName());
		lp.setEmail(updateModel.getEmail());
		lp.setPhoneNumber(updateModel.getPhoneNumber());
		lp.setRole(updateModel.getRole());
		lp.setCity(updateModel.getCity());
		lp.setState(updateModel.getState());
		lp.setCountry(updateModel.getCountry());
		lp.setLpId(updateModel.getUserId());

		boolean stored = lpDao.storeLpDetails(lp);

		boolean result = false;
		if (stored)
			result = true;
		else
			result = false;

		return result;
	}
}

