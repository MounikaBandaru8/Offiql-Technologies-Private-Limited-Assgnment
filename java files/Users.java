package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
    private String FirstName;
	private String Lastname;
	private String Emailaddress;
	private int phonenumber;

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmailaddress() {
		return Emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		Emailaddress = emailaddress;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Customers [FirstName=" + FirstName + ", Lastname=" + Lastname + ", Emailaddress=" + Emailaddress
				+ ", phonenumber=" + phonenumber + "]";
	}


	


}
