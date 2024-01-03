package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Vehicle;

public interface Customer_service {

	List<Vehicle> addNewVehicle(int type);
	//Set<Vehicle> addNewVehicle(int type);

	Set<Vehicle> DisplayAll();

	Vehicle SearchModel(String smodel);

	List<Vehicle> bookVehicle(String type1, int price1);

}
