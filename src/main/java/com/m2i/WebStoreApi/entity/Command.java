package com.m2i.WebStoreApi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter @AllArgsConstructor @ToString
public class Command {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Getter @Setter
	private Date commandDate;
	
	@OneToMany(targetEntity = CommandLine.class, mappedBy="command")
	@JsonIgnore
	private List<CommandLine> commandLines = new ArrayList<>();
	
//	@OneToOne(mappedBy="command")
//	private Payment payment;
	@JsonIgnore
	@ManyToOne @JoinColumn(name="id_user")
	private User user;
	
	public Command() {
		Faker f = new Faker();
		
		this.commandDate = f.date().birthday();
	}
	

}
