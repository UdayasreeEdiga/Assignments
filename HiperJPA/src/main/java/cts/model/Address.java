package cts.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class Address implements Serializable {
	private String Dno;
	private String AddressLine1;
	private String AddressLine2;
	public Address() {
		
		
	}
	public Address(String dno, String addressLine1, String addressLine2) {
		super();
		this.Dno = dno;
		this.AddressLine1 = addressLine1;
		this.AddressLine2 = addressLine2;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	
	

}
