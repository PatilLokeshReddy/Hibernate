package com.Employee.Employee_Details;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmpDetails {
	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", Dept=" + Dept + ", Sal=" + Sal + "]";
	}
	@Id
	private int id;
	private String name;
	private String Dept;
	private int Sal;
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
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}

}
