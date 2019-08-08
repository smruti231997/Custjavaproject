package com.Cust.CustDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cust")
public class CustDemo {
	@Id
	private Integer id;
	private String name;
	private String location;
	@Override
	public String toString() {
		return "CustDemo [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
