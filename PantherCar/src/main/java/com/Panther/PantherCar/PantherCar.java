package com.Panther.PantherCar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Car")
public class PantherCar {
	@Id
	private int modelNum;
	private String name;
	private int price;
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PantherCar [modelNum=" + modelNum + ", name=" + name + ", price=" + price + "]";
	}
	

}
