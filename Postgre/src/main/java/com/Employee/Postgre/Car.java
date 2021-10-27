package com.Employee.Postgre;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Car {
	@Id
	private int car_no;
	private String car_name;
	private int car_price;
	public int getCar_no() {
		return car_no;
	}
	public void setCar_no(int car_no) {
		this.car_no = car_no;
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
}
