package com.Family.Patil;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Persons {
	@Id
	private int pNum;
	private String Name;
	private int inCome;
	@ManyToMany(mappedBy="per")
	List<Cars> c=new ArrayList<Cars>();
	public List<Cars> getCar() {
		return c;
	}
	public void setCar(List<Cars> car) {
		this.c = car;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getInCome() {
		return inCome;
	}
	public void setInCome(int inCome) {
		this.inCome = inCome;
	}
	@Override
	public String toString() {
		return "Persons [pNum=" + pNum + ", Name=" + Name + ", inCome=" + inCome + "]";
	}


}
