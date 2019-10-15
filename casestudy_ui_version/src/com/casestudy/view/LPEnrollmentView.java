package com.casestudy.view;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
 * Name         Null?    Type         
------------ -------- ------------ 
LP_ID        NOT NULL VARCHAR2(10) 
FIRST_NAME   NOT NULL VARCHAR2(10) 
LAST_NAME    NOT NULL VARCHAR2(10) 
DOB                   DATE         
PHONE_NUMBER NOT NULL NUMBER(10)   
EMAIL        NOT NULL VARCHAR2(20) 
ROLE                  VARCHAR2(10) 
BATCH_ID              VARCHAR2(10) 

 */
import java.util.Scanner;
import java.util.StringTokenizer;

import com.casestudy.controller.LPEnrollmentController;
import com.casestudy.convertor.DateConvertor;
import com.casestudy.model.LPRegisterModel;

public class LPEnrollmentView {

	public void menu() {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("=============Registering onbording employee details===========");
			System.out.print("   |  Employee ID:              |");
				String LP_ID = sc.next();
			System.out.print("\n |  Employee First Name:      |");
				String First_Name = sc.next();
			System.out.print("\n |  Employee Last Name:       |");
				String Last_Name = sc.next();
			System.out.print("\n |  Date of Birth:(DD/MM/YYYY)|");
				String DOB = sc.next();
				/*StringTokenizer tokens = new StringTokenizer(DOB,"/");
				List<String> list = new ArrayList<>();
				while(tokens.hasMoreTokens()) {
			list.add(tokens.nextToken());
				}
				int day=Integer.parseInt(list.get(0));
				int month = Integer.parseInt(list.get(1));
				int year = Integer.parseInt(list.get(2));
				LocalDate dob = LocalDate.of(year, month-1, day);*/
				LocalDate dob = DateConvertor.dateFormat(DOB);
			System.out.print("\n |  Employee Contact:         |");
			int Phone_number = 0;
				if(sc.hasNextInt())
					Phone_number = sc.nextInt();
			System.out.print("\n |  Employee Email:           |");
			String Email = sc.next();
			System.out.print("\n |  Employee Designation:     |");
			String Role = sc.next();
			//System.out.println(Role);
			//System.out.print("\n | Batch_id:              |");
			String Batch_id = null;
			LPRegisterModel lprm = new LPRegisterModel();
				lprm.setLP_ID(LP_ID);
				lprm.setFirst_Name(First_Name);
				lprm.setLast_Name(Last_Name);
				lprm.setDOB(dob);
				lprm.setPhone_Number(Phone_number);
				lprm.setEmail(Email);
				lprm.setRole(Role);
				lprm.setBatch_Id(Batch_id);
				
			LPEnrollmentController lpec = new LPEnrollmentController();
			lpec.registerLPDetails(lprm);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}