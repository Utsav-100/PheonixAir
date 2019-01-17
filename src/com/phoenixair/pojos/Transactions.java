package com.phoenixair.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transactions")
public class Transactions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "transactionId")
	private int transactionId;

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	@Column(name = "cardNo")
	private int cardNo;
	@NotNull
	@Column(name = "expMonth")
	private String expMonth;
	@NotNull
	@Column(name = "expYear")
	private String expYear;
	@NotNull
	@Column(name = "amount")
	private double amount;

	
	
	  
	  
	@ManyToOne  
	//@JoinColumn(name="userid",nullable=false)
	private FlightUser flightUser;

	@SequenceGenerator(name = "txseq", sequenceName = "txseq")
	public int getTransactionId() {
		return transactionId;
	}

	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transactions(int cardNo, String expMonth, String expYear, double amount, FlightUser flightUser) {
		super();
		this.flightUser = flightUser;
		this.cardNo = cardNo;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.amount = amount;
	}

	public FlightUser getFlightUser() {
		return flightUser;
	}

	public void setFlightUser(FlightUser flightUser) {
		this.flightUser = flightUser;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transactions [flightUser=" + flightUser + ", cardNo=" + cardNo + ", expMonth=" + expMonth + ", expYear="
				+ expYear + ", amount=" + amount + "]";
	}

}
