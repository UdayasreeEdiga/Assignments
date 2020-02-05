package com.cts.demo.service;

import com.cts.demo.model.Medicine;
import com.cts.demo.exception.MedicineException;

import java.util.List;

public interface IMedicineService {	
	String add(Medicine medicine) throws MedicineException;
	boolean delete(String tname) throws MedicineException;
	Medicine get(String tname) throws MedicineException;
	List<Medicine> getAll() throws MedicineException;;
	boolean update(Medicine medicalstore) throws MedicineException;
	//void persist()throws BookStoreException;
}