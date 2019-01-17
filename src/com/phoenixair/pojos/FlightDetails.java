package com.phoenixair.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="flightdetails")
public class FlightDetails {
	
	
	//instance vars.
	
	@Id
	@GeneratedValue
	@Column(name="fid")
	private int flight_id;

	/*
	 * @Column(name="opdays") private List<String> day;
	 */
	
	
	
	@Column(name="fcity")
	private String from_city;
	@Column(name="tcity")
	private String to_city;
	private int noofEconomySeats;
	private int noofBuisnessSeats;
	private double economyPrice;
	private double buisnessPrice;
	
	@OneToMany
	private List<Passengers> passengers;
	
	
	
	
	//constrr with no args
	
	
	


	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
    public FlightDetails(int flight_id, 
 String from_city, String to_city, int noofEconomySeats,
			int noofBuisnessSeats, double economyPrice, double buisnessPrice, Passengers passengers) {
		super();
		this.flight_id = flight_id;


		this.from_city = from_city;
		this.to_city = to_city;
		this.noofEconomySeats = noofEconomySeats;
		this.noofBuisnessSeats = noofBuisnessSeats;
		this.economyPrice = economyPrice;
		this.buisnessPrice = buisnessPrice;
		
	}



	@SequenceGenerator(name="flightseq",sequenceName="flightseq")
	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	
	
	/*
	 * public List<String> getDay() { return day; }
	 * 
	 * public void setDay(List<String> day) { this.day = day; }
	 */
	
	
	
	public String getFrom_city() {
		return from_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public String getTo_city() {
		return to_city;
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public int getNoofEconomySeats() {
		return noofEconomySeats;
	}

	public void setNoofEconomySeats(int noofEconomySeats) {
		this.noofEconomySeats = noofEconomySeats;
	}

	public int getNoofBuisnessSeats() {
		return noofBuisnessSeats;
	}

	public void setNoofBuisnessSeats(int noofBuisnessSeats) {
		this.noofBuisnessSeats = noofBuisnessSeats;
	}

	public double getEconomyPrice() {
		return economyPrice;
	}

	public void setEconomyPrice(double economyPrice) {
		this.economyPrice = economyPrice;
	}

	public double getBuisnessPrice() {
		return buisnessPrice;
	}

	public void setBuisnessPrice(double buisnessPrice) {
		this.buisnessPrice = buisnessPrice;
	}
			
	
	/*
	 * public Passengers getPassengers() { return passengers; }
	 * 
	 * 
	 * 
	 * public void setPassengers(Passengers passengers) { this.passengers =
	 * passengers; }
	 */
	
	
	
	
	

	@Override
	public String toString() {
		return "FlightDetails [flight_id=" + flight_id + ", from_city=" + from_city + ", to_city="
				+ to_city + ", noofEconomySeats=" + noofEconomySeats + ", noofBuisnessSeats=" + noofBuisnessSeats
				+ ", economyPrice=" + economyPrice + ", buisnessPrice=" + buisnessPrice + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
