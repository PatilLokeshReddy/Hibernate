package com.Users.Bike;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike_Model {
	@Id
	private int bike_modelno;
	private String bike_name;
	private String bike_color;
	public int getBike_modelno() {
		return bike_modelno;
	}
	public void setBike_modelno(int bike_modelno) {
		this.bike_modelno = bike_modelno;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getBike_color() {
		return bike_color;
	}
	public void setBike_color(String bike_color) {
		this.bike_color = bike_color;
	}
	
}
