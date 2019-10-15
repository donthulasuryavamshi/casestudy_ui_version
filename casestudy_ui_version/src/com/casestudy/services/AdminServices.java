package com.casestudy.services;
import com.casestudy.dao.AdminLoginAuthDao;
import com.casestudy.dao.AdminProfile;
import com.casestudy.dao.AdminProfileDao;
import com.casestudy.dao.LPRegisterDao;
import com.casestudy.dao.LpRegister;
import com.casestudy.dao.MentorView;
import com.casestudy.dao.MentorViewDao;
import com.casestudy.dao.TrainingVenues;
import com.casestudy.dao.UpdateProfile;
import com.casestudy.dao.ViewBatch;
import com.casestudy.dao.ViewLPs;
import com.casestudy.dao.viewBatchesDao;
import com.casestudy.helper.FactoryMethod;
import com.casestudy.model.LPRegisterModel;
import com.casestudy.view.LPEnrollmentView;
public class AdminServices implements AdminServicesInterface {
	//public AdminServicesInterface as = new AdminServices();
	@Override
	public void  adminAuth(String username, String password) { 
	//public void  adminAuth(String username, String password) { //  throws ClassNotFoundException, SQLException {
		AdminLoginAuthDao alad = new AdminLoginAuthDao();
		try {
			alad.adminLoginVerification(username,password);
			/*if(res==true) {
				as.loginSuccessMessage();
				return true;
			}else {
				as.loginUnSuccessMessage();
				return false;
			} */
		}catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//return false;
	}
	/*public void loginSuccessMessage() {
		//System.out.println("authenticated successfully");
		LoginController lsc = new LoginController();
		lsc.adminLoginSuccessful();
	}
	public void loginUnSuccessMessage() {
		//System.out.println("unsuccessful authentication");
		LoginController lsc = new LoginController();
		lsc.adminLoginUnSuccessful();
	}
	/*public void LoginView() {
		AdminLoginView alv = new AdminLoginView();
		alv.loginForm();
	}*/
	@Override
	public void enrollService() {
		// TODO Auto-generated method stub
		LPEnrollmentView lpev = new LPEnrollmentView();
		lpev.menu();
	}
	private LpRegister lpRegister = FactoryMethod.lpRegisterFactory();
	private AdminProfile adminProfile = FactoryMethod.adminProfileFactory();
	private MentorView mentorView= FactoryMethod.mentorViewFactory();
	private ViewBatch viewBatch = FactoryMethod.viewBatchFactory();
	private UpdateProfile updateProfile = FactoryMethod.updateProfile();
	private ViewLPs viewLPs = FactoryMethod.viewLPsList();
	private TrainingVenues trainingVenues = FactoryMethod.viewTrainingVenues();
	@Override
	public void lpDetails(LPRegisterModel lprm) {
		// TODO Auto-generated method stub
		//LPRegisterDao lprd = new  LPRegisterDao();
		//public FactoryMethod factoryMethod = new FactoryMethod();
		lpRegister.lpDetailsFilling(lprm);

	}
	@Override
	public void profileViewServices() {
		// TODO Auto-generated method stub
		//AdminProfileDao ap = new AdminProfileDao();
		adminProfile.viewMyProfile();
	}
	@Override
	public void viewMentors() {
		// TODO Auto-generated method stub
		//MentorViewDao mv = new MentorViewDao();
		mentorView.viewMentorsListDao();
	}
	@Override
	public void viewBatches() {
		// TODO Auto-generated method stub
		try{
			//viewBatchesDao vbd = new viewBatchesDao();
			viewBatch.viewBatchesDetails();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void profileUpdate() {
		// TODO Auto-generated method stub
		updateProfile.updateProfile();
		
		
	}
	@Override
	public void viewLPs() {
		// TODO Auto-generated method stub
		viewLPs.viewLPs();
	}
	@Override
	public void trainingVenues() {
		// TODO Auto-generated method stub
		trainingVenues.viewTrainingVenues();
	}
}