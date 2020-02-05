package com.cts.demo.exception;

@SuppressWarnings("serial")
public class MedicineException extends Exception {
	public MedicineException(String errMsg){
		super(errMsg);
	}
}