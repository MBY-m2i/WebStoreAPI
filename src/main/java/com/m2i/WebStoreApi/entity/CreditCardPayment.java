package com.m2i.WebStoreApi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CreditCardPayment")
@Getter @Setter
@ToString
public class CreditCardPayment extends Payment {
	
	@Column(name="cardNumber")
	private String cardNumber;
	
	@Column(name="expirationDate")
	private Date expirationDate;

	public CreditCardPayment(float amount, Date paymentDate, String cardNumber, Date expirationDate) {
		super(amount, paymentDate);
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
	}

	public CreditCardPayment() {
		super();
	}

}
