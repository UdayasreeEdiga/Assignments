package com.cts.bscp.model;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Represents a book in a library or book store.
 */
@SuppressWarnings("serial")
public class Book implements Serializable /* implements Comparable<Book> */ {

	private String bcode;
	private String title;
	private LocalDate publishDate;
	private double price;

	public Book() {
		/* default constructor */
	}

	public Book(String bcode, String title, LocalDate publishDate, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Book Code : ");
		output.append(bcode);
		output.append("\tTitle : ");
		output.append(title);
		output.append("\tPublish Date :");
		output.append(publishDate);
		output.append("\tPrice : ");
		output.append(price);
		return output.toString();
	}

	
	
}
