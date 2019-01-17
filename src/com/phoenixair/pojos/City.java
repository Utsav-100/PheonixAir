package com.phoenixair.pojos;

public class City {
	
	//instance vars
	
	private String cityId;
	private String cityName;
	private String airport;
	
	//contrs without params and with params
	
	
	

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	//getters and setters

	


	public City(String cityId, String cityName, String airport) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.airport = airport;
	}

	
	
	
	




	public String getCityId() {
		return cityId;
	}





	public void setCityId(String cityId) {
		this.cityId = cityId;
	}





	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getAirport() {
		return airport;
	}


	public void setAirport(String airport) {
		this.airport = airport;
	}
	
	
	
	
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", airport=" + airport + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
