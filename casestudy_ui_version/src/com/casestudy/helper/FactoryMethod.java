package com.casestudy.helper;

//package com.virtusa.helper;

import com.casestudy.dao.AdminProfile;
import com.casestudy.dao.AdminProfileDao;
import com.casestudy.dao.LPRegisterDao;
import com.casestudy.dao.LPsListView;
import com.casestudy.dao.LpRegister;
import com.casestudy.dao.MentorView;
import com.casestudy.dao.MentorViewDao;
import com.casestudy.dao.TrainingVenues;
import com.casestudy.dao.UpdateProfile;
import com.casestudy.dao.UpdateProfileImpl;
import com.casestudy.dao.ViewBatch;
import com.casestudy.dao.ViewLPs;
import com.casestudy.dao.ViewTrainingVenuesImpl;
import com.casestudy.dao.viewBatchesDao;

public class FactoryMethod {
	public static LpRegister lpRegisterFactory() {
		LpRegister lprd = new  LPRegisterDao();
		return lprd;
	}
	public static AdminProfile adminProfileFactory() {
		AdminProfile ap = new AdminProfileDao();
		return ap;
	}
	public static MentorView mentorViewFactory() {
		MentorView mentorView = new MentorViewDao();
		return mentorView;
	}
	public static ViewBatch viewBatchFactory() {
		ViewBatch viewBatch =  new viewBatchesDao();
		return viewBatch;
	}
	public static UpdateProfile updateProfile() {
		UpdateProfile updateProfile = new UpdateProfileImpl();
		return updateProfile;
	}
	public static ViewLPs viewLPsList() {
		ViewLPs viewLPs = new LPsListView();
		return viewLPs;
	}
	public static TrainingVenues viewTrainingVenues() {
		TrainingVenues trainingVenues = new ViewTrainingVenuesImpl();
		return trainingVenues;
	}
}
