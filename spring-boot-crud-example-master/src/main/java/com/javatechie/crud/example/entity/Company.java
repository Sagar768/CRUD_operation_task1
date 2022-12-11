package com.javatechie.crud.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Company {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "NUMBER_OF_PLANTS")
	private int no_of_plants;
	@Column(name = "STARTED" , columnDefinition = "DATE")
	private LocalDate started;
	@Column(name = "MODIFIED" , columnDefinition = "DATE")
	private LocalDate modified;
}
