package com.casestudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.log4j.Logger;

import com.casestudy.dbconnection.DataBaseConnector;
import com.casestudy.model.UpdateModel;

//package com.casestudy.dao;

public class UpdateProfileImpl implements UpdateProfile{
	Logger log = Logger.getLogger(UpdateProfileImpl.class.getName());
	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		log.debug("providev details to update your Profile");
		Connection con = DataBaseConnector.initilizConnection();
		UpdateModel model = UpdateProfile
		PreparedStatement ps = con.prepareStatement("")
	}

}
