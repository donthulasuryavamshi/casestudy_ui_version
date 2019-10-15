package com.casestudy.services;

import com.casestudy.model.LPRegisterModel;

public interface AdminServicesInterface {
	public void  adminAuth(String username, String password);
	public void enrollService();
	public void lpDetails(LPRegisterModel lprm);
	public void profileViewServices();
	public void viewMentors();
	public void viewBatches();
	public void profileUpdate();
	public void viewLPs();
	public void trainingVenues();
}
