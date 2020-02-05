package com.cts.demo.model;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Represents a book in a library or book store.
 */
@SuppressWarnings("serial")
public class Medicine implements Serializable /* implements Comparable<Book> */ {

	
	private String tname;
	private String disease;
	private LocalDate manufactureDate;
	private double price;

	public Medicine() {
		/* default constructor */
	}

	public Medicine(String tname, String disease, LocalDate manufactureDate, double price) {
		super();
		
		this.tname = tname;
		this.disease=disease;
		this.manufactureDate = manufactureDate;
		this.price = price;
	}
	
	
	

	
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("name : ");
		output.append(tname);
		output.append("\tDisease : ");
		output.append(disease);
		output.append("\tManufacture Date :");
		output.append(manufactureDate);
		output.append("\tPrice : ");
		output.append(price);
		return output.toString();
	}

		
	

}
