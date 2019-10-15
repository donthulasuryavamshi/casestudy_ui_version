package com.casestudy.entities;

//package com.virtusa.entities;

/**
 * 
 * LP_ID NOT NULL NUMBER(10) FIRST_NAME NOT NULL VARCHAR2(20) LAST_NAME NOT NULL
 * VARCHAR2(20) EMAIL NOT NULL VARCHAR2(25) PHONE_NUMBER VARCHAR2(20)
 * DESIGNATION VARCHAR2(30) COUNTRY VARCHAR2(30) STATE VARCHAR2(30) CITY
 * VARCHAR2(25)
 * 
 * @author ACER
 *
 */
public class LP1 {

	private String lpId;
	private String firstName;
	private String LastName;
	private String email;
	private String phoneNumber;
	private String role;
	private String city;
	private String state;
	private String country;

	public LP1() {

	}

	public String getLpId() {
		return lpId;
	}

	public void setLpId(String string) {
		this.lpId = string;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lpId == null) ? 0 : lpId.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		LP1 other = (LP1) obj;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lpId == null) {
			if (other.lpId != null)
				return false;
		} else if (!lpId.equals(other.lpId))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LP1 [lpId=" + lpId + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", role=" + role + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

	
	
	
	
	

}