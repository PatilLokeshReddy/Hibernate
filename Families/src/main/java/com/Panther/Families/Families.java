package com.Panther.Families;

import javax.persistence.Embeddable;

@Embeddable
public class Families {
	private String firstName;
	private String middleName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Families [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
}
