package com.Panther.Families;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Panther_Family")
public class PantherFamilies {
	@Id
	private int Id;
	private Families pName;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Families getpName() {
		return pName;
	}
	public void setpName(Families pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
