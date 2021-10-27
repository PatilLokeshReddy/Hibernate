package com.Aadhaar.Person;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class AadhaarDetails {
	@Id
	private  long adNumber;
	private String State;
	private int pinCode;
	private String address;
	@OneToOne
	private PersonDetails pDetails;
	public PersonDetails getpDetails() {
		return pDetails;
	}
	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}
	public long getAdNumber() {
		return adNumber;
	}
	public void setAdNumber(long adNumber) {
		this.adNumber = adNumber;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AadhaarDetails [adNumber=" + adNumber + ", State=" + State + ", pinCode=" + pinCode + ", address="
				+ address + ", pDetails=" + pDetails + "]";
	}

}
