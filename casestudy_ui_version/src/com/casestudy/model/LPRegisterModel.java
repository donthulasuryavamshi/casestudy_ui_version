package com.casestudy.model;
/*
 * pojoclass
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
import java.time.LocalDate;
public class LPRegisterModel {
	public LPRegisterModel() {}
	private String LP_ID;
	private String First_Name;
	private String Last_Name;
	private LocalDate DOB;
	private int Phone_Number;
	private String Email;
	private String Role;
	private String Batch_Id;
	public String getLP_ID() {
		return LP_ID;
	}
	public void setLP_ID(String lP_ID) {
		LP_ID = lP_ID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public int getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getBatch_Id() {
		return Batch_Id;
	}
	public void setBatch_Id(String batch_Id) {
		Batch_Id = batch_Id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Batch_Id == null) ? 0 : Batch_Id.hashCode());
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((First_Name == null) ? 0 : First_Name.hashCode());
		result = prime * result + ((LP_ID == null) ? 0 : LP_ID.hashCode());
		result = prime * result + ((Last_Name == null) ? 0 : Last_Name.hashCode());
		result = prime * result + Phone_Number;
		result = prime * result + ((Role == null) ? 0 : Role.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LPRegisterModel other = (LPRegisterModel) obj;
		if (Batch_Id == null) {
			if (other.Batch_Id != null)
				return false;
		} else if (!Batch_Id.equals(other.Batch_Id))
			return false;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (First_Name == null) {
			if (other.First_Name != null)
				return false;
		} else if (!First_Name.equals(other.First_Name))
			return false;
		if (LP_ID == null) {
			if (other.LP_ID != null)
				return false;
		} else if (!LP_ID.equals(other.LP_ID))
			return false;
		if (Last_Name == null) {
			if (other.Last_Name != null)
				return false;
		} else if (!Last_Name.equals(other.Last_Name))
			return false;
		if (Phone_Number != other.Phone_Number)
			return false;
		if (Role == null) {
			if (other.Role != null)
				return false;
		} else if (!Role.equals(other.Role))
			return false;
		return true;
	}
	
}
