package com.casestudy.services;
import java.sql.SQLException;
import com.casestudy.model.LpModel;
import com.casestudy.model.UpdateLpDetailsModel;
public interface LpService {
	LpModel retrieveLpDetails(String userId);

	boolean storeLpService(UpdateLpDetailsModel updateLpDetailsView) throws ClassNotFoundException, SQLException;

}

