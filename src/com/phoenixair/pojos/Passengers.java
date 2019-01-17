package com.phoenixair.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
/*import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;*/





@Entity
@Table(name="passengers")
public class Passengers {
	//instance vars..
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="pnr")
	private int pnr;
	
	@Column(name="title")
	@NotEmpty
	private String title;
	
	
	@Column(name="firstName")
	@NotEmpty
	private String firstName;
	
	
	
	@Column(name="lastName")
	@NotEmpty
	private String lastName;
	
	  @SequenceGenerator(name="pgrseq", sequenceName="pgrseq")
	public int getPnr() {
		return pnr;
	}



	@Column(name="seatNo",unique=true)
	
	private int seatNo;
	
	
	@ManyToOne
	private FlightUser fUser;  //referring flight user
	
	@ManyToOne
	private FlightDetails flightDetails; // referring flight details
	
	
	//consts with no args and parameterized constrs.
	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
  







public Passengers( @NotEmpty String title, @NotEmpty String firstName, @NotEmpty String lastName,
			int seatNo, FlightUser fUser, FlightDetails flightDetails) {
		super();
		
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.seatNo = seatNo;
		this.fUser = fUser;
		this.flightDetails = flightDetails;
	}











//getters and setters

	
  
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}











	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}











	public void setPnr(int pnr) {
		this.pnr = pnr;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSeatNo() {
		return seatNo;
	}


	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	
	
	


	public void setFuser(FlightUser fuser) {
		this.fUser = fuser;
	}



	
	
	@Override
	public String toString() {
		return "Passengers [pnr=" + pnr + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", seatNo=" + seatNo + "]";
	}


	
	
	

}
