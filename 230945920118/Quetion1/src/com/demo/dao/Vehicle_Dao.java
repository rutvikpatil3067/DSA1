package com.demo.dao;

import java.util.Set;

import com.demo.beans.Vehicle;

public interface Vehicle_Dao {

	void save(Vehicle v);

	Set<Vehicle> DisplayListOfVehicles();

}
