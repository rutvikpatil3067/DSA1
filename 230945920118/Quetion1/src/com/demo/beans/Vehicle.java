package com.demo.beans;

import java.time.LocalDate;

public class Vehicle 
{
	private int v_id;
	private String owner_name;
	private LocalDate dom;
	private String type;
	private String s_name;
	private String make;
	private String model;
	private int  price;
	private String status;
	
	
	public Vehicle(int v_id, String owner_name, LocalDate dom, String type, String s_name, String make, String model,
			int price, String status) {
		super();
		this.v_id = v_id;
		this.owner_name = owner_name;
		this.dom = dom;
		this.type = type;
		this.s_name = s_name;
		this.make = make;
		this.model = model;
		this.price = price;
		this.status = status;
	}


	public int getV_id() {
		return v_id;
	}


	public void setV_id(int v_id) {
		this.v_id = v_id;
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public LocalDate getDom() {
		return dom;
	}


	public void setDom(LocalDate dom) {
		this.dom = dom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String isStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Vehicle [v_id=" + v_id + ", owner_name=" + owner_name + ", dom=" + dom + ", type=" + type + ", s_name="
				+ s_name + ", make=" + make + ", model=" + model + ", price=" + price + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
