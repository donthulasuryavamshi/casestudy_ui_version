package com.casestudy.view;

import java.time.LocalDate;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.casestudy.dao.UpdateProfile;
import com.casestudy.dao.UpdateProfileImpl;
import com.casestudy.model.UpdateModel;

public class UpdateProfileView {
	Logger log= Logger.getLogger(UpdateProfileView.class.getClass());
	UpdateProfile profile = new UpdateProfileImpl();
	public UpdateModel updateProfile() {
		UpdateModel model = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("what do u want to update");
		System.out.println("|1. firstname  |"
						  +"|2. lastname  |"
						  +"|3. phonenumber|"
						  +"|4. email      |"
						  +"|5. Go back");
		if(sc.hasNextInt()) {
			int option = sc.nextInt();
			switch(option){
				case 1:
					System.out.println("eneter name:");
					String firstname = sc.next();
					model.setFirstname(firstname);
					profile.updateProfile(model);
					break;
				case 2:
					System.out.println("eneter name:");
					String lastname = sc.next();
					model.setFirstname(lastname);
					profile.updateProfile(model);
					break;
				case 3:
					System.out.println("eneter name:");
					String phonenumber = sc.next();
					model.setFirstname(phonenumber);
					profile.updateProfile(model);
					break;
				case 4:
					System.out.println("eneter name:");
					String email = sc.next();
					model.setFirstname(email);
					profile.updateProfile(model);
					break;
				default:
					System.out.println("invalidd option");
					UpdateProfileView pro = new UpdateProfileView();
					pro.updateProfile();
					break;
			}
		}
		return null;
	}
 }
