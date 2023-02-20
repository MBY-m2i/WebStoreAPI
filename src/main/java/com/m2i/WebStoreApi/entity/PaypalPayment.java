package com.m2i.WebStoreApi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PaypalPayment")
@Getter @Setter
@ToString
public class PaypalPayment extends Payment {
	
	@Column(name="accountNumber")
	private String AccountNumber;

	public PaypalPayment(float amount, Date paymentDate, String accountNumber) {
		super(amount, paymentDate);
		AccountNumber = accountNumber;
	}

	public PaypalPayment() {
		super();
	}		

}
