package com.phoenixair.pojos;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.Email;


@Entity
@Table(name="flightuser")

public class FlightUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//instance variables
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int user_id;
	
	@NotEmpty
	@NotNull(message="first name must be filled as per your document ID")
	@Column(name="firstname")
	private String first_name;
	@NotEmpty
	@Column(name="lastname")
	private String last_name;
	@NotNull
	@Email
	@Column(name="email")
	private String email;
    @NotNull
	@Column(name="password")
	private String password;
    @NotNull
	@Column(name="DOB")
	private java.sql.Date dob;
    
	@Column(name="contact")
	private int contact;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Transactions> transactions;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Passengers> passengers;
	
	
	
	
	
	

	
	
	
	//constructor with no args.
	
	public FlightUser() {
		super();
	}

	/*
	 * //constructor with args public FlightUser(String first_name, String
	 * last_name, String email, String password, Date dob, int contact,
	 * List<Passengers> passengers) { super(); this.first_name = first_name;
	 * this.last_name = last_name; this.email = email; this.password = password;
	 * this.dob = dob; this.contact = contact; this.passengers = passengers; }
	 */
	
	
	
	
	//getters and setters

	
	
	
	
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	
	@SequenceGenerator(name="fuserseq",sequenceName="fuserseq")
	public int getUser_id() {
		return user_id;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	
	
	
	//toString() method to display all the fields
	
	
	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "FlightUser [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", dob=" + dob + ", contact=" + contact + "]";
	}

	public List<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	

