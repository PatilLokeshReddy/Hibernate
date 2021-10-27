package com.Family.Patil;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cars {
	@Override
	public String toString() {
		return "Cars [modelNum=" + modelNum + ", carName=" + carName + ", color=" + color + ", price=" + price
				+ ", per=" + per + "]";
	}
	@Id
	private int modelNum;
	private String carName;
	private String color;
	private int price;
	@ManyToMany
	private List<Persons> per=new ArrayList<Persons>();
	public List<Persons>getPer() {
		return per;
	}
	public void setPer(List<Persons> per) {
		this.per = per;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
