package com.Aadhaar.Person;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PersonDetails {
	@Id
	private int pNO;
	private String name;
	private String dOfBirth;
	private String gender;
	private long PNum;
	public int getpNO() {
		return pNO;
	}
	public void setpNO(int pNO) {
		this.pNO = pNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdOfBirth() {
		return dOfBirth;
	}
	public void setdOfBirth(String dOfBirth) {
		this.dOfBirth = dOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPNum() {
		return PNum;
	}
	public void setPNum(long pNum) {
		PNum = pNum;
	}
	@Override
	public String toString() {
		return "PersonDetails [pNO=" + pNO + ", name=" + name + ", dOfBirth=" + dOfBirth + ", gender=" + gender
				+ ", PNum=" + PNum + "]";
	}
	


}
