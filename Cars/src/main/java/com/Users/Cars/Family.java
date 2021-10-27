package com.Users.Cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Family {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long ph_no;
	@OneToOne
	private Cars car;
	public Cars getCar() {
		return car;
	}
	public void setCar(Cars car) {
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	@Override
	public String toString() {
		return "Family [id=" + id + ", name=" + name + ", ph_no=" + ph_no + ", car=" + car + "]";
	}
}
