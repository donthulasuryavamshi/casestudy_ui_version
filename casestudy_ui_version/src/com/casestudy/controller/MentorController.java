package com.casestudy.controller;
import com.casestudy.helper.FactoryMentorService;
import com.casestudy.model.MentorModel;
import com.casestudy.services.MentorService;
import com.casestudy.view.MainLoginForm;
import com.casestudy.view.MentorView;

public class MentorController {
	
			MentorService mentorService;
			public MentorController(){
				
				this.mentorService=FactoryMentorService.createMentorService();
			}
			public void mentorAuthentication(String mentorId,String mentorPassword) {
				
				MentorModel mentorModel=new MentorModel();
				mentorModel.setMentorId(mentorId);
				mentorModel.setMentorPassword(mentorPassword);
	
				boolean mentorType=mentorService.mentorAuthenticationService(mentorModel);
				 if(mentorType==true) {
				     System.out.println("************************Login Successful****************************");						
				     MentorView.mentorMenu();
					
				}else {
					System.out.println("***Invalid user name or password***");
					System.out.println("***Please Try Again***");
					MainLoginForm.menu();
					//LoginView.mentorLogin();
				
				}		
			}
}

