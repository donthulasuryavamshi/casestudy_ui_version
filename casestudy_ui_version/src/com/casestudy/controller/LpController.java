package com.casestudy.controller;
import java.sql.SQLException;
import java.util.List;

import com.casestudy.helper.FactoryLpService;
import com.casestudy.model.LpModel;
import com.casestudy.model.UpdateLpDetailsModel;
import com.casestudy.services.LpService;
import com.casestudy.view.LpView;
public class LpController {
	LpService lpService;
	public LpController() {
		this.lpService = FactoryLpService.createLpService();
	}

	public void retrieveLpDetails(String userId) {

		LpModel lpModel = lpService.retrieveLpDetails(userId);
		LpView lpView = new LpView();
		lpView.viewLpDetails(lpModel);

	}

	public void storeLp(UpdateLpDetailsModel updateLpDetailsView) throws ClassNotFoundException, SQLException {

		LpView lpView = new LpView();
		boolean result = lpService.storeLpService(updateLpDetailsView);

		String userId = updateLpDetailsView.getUserId();

		if (result) {
			lpView.storeSuccess(userId);

		} else {

			lpView.storeUnsuccess(userId);
		}

	}
}
