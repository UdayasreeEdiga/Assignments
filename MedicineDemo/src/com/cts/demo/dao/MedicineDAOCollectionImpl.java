package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import com.cts.demo.exception.MedicineException;

import com.cts.demo.model.Medicine;

public class MedicineDAOCollectionImpl implements IMedicineDAO {
	
	private Map<String, Medicine> medicines;
	
	public MedicineDAOCollectionImpl() {
		medicines = new TreeMap<>();
	}
	
	@Override
	public String add(Medicine medicine) throws MedicineException {
		String tname = null;
		if (medicine != null) {
			tname = medicine.getTname();
			medicines.put(tname, medicine);	
		}
		return tname;
	}
	
	@Override
	public boolean delete(String tname) throws MedicineException {
		boolean isDone = false;
		if (tname != null) {
			medicines.remove(tname);
			isDone = true;
		}
		return isDone;
	}
	
	@Override
	public Medicine get(String tname) throws MedicineException {
		return medicines.get(tname);
	}
	

	@Override
	public List<Medicine> getAll() throws MedicineException {
		return new ArrayList<>(medicines.values());
	}
	
	@Override
	public boolean update(Medicine medicine) throws MedicineException {
		boolean isDone = false;
		if (medicine != null) {
			String tname = medicine.getTname();
			medicines.replace(tname, medicine);
			
		}
		return isDone;
	}


	
	
}