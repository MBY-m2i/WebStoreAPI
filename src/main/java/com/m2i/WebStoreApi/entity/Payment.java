package com.m2i.WebStoreApi.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Payment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private float amount;
	private Date paymentDate;
	
	public Payment(int id, float amount, Date paymentDate) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public Payment(float amount, Date paymentDate) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public Payment() {
		super();
	}

}
