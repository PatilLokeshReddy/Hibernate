package com.Users.Cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cars {
	@Id
	@GeneratedValue
	private int car_modenlNo;
	private String car_name;
	private int car_price;
	public int getCar_modenlNo() {
		return car_modenlNo;
	}
	public void setCar_modenlNo(int car_modenlNo) {
		this.car_modenlNo = car_modenlNo;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getCar_price() {
		return car_price;
	}
	public void setCar_price(int car_price) {
		this.car_price = car_price;
	}
	@Override
	public String toString() {
		return "Cars [car_modenlNo=" + car_modenlNo + ", car_name=" + car_name + ", car_price=" + car_price + "]";
	}
	
}
