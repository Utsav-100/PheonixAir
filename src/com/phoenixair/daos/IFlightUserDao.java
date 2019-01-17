package com.phoenixair.daos;

import com.phoenixair.pojos.Passengers;

public interface IFlightUserDao {
	
	
	public int addPassengers(Passengers p);
	
	public int remPassengers(Passengers p);
	
	public String bookFlight();
	
	
	
	

}
