package com.cts.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.demo.dao.MedicineDAOCollectionImpl;
import com.cts.demo.dao.IMedicineDAO;
import com.cts.demo.exception.MedicineException;
import com.cts.demo.model.Medicine;

public class MedicineServiceImpl implements IMedicineService {
	
	private IMedicineDAO medicineDao;

	public IMedicineDAO getDAO(){
		return medicineDao;
	}
	
	public MedicineServiceImpl() throws MedicineException {
		medicineDao = new MedicineDAOCollectionImpl();
		// bookDao = new BookDAOStreamImpl();
		
	}
	
	public boolean isValidTname(String tname){
		
		/*
		 * First letter must be capital
		 
		 */
		Pattern tnamePattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher tnameMatcher = tnamePattern.matcher(tname);
		
		return tnameMatcher.matches();
	}
	
	public boolean isValidDisease(String disease){
		/*
		 * First Letter should be capital
		 *	
		 */
		Pattern diseasePattern = Pattern.compile("[A-Z]\\w{3,19}");
		Matcher diseaseMatcher = diseasePattern.matcher(disease);
		
		return diseaseMatcher.matches();
	}
	
	public boolean isValidPrice(double price){
		/*
		 * Price is between 5 and 5000
		 */
		return price>=5 && price<=5000;
	}
	
	public boolean isValidManufactureDate(LocalDate manufactureDate){
		/*
		 * publish date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return publishDate.isBefore(today) || publishDate.equals(today);
		return today.isAfter(manufactureDate) || manufactureDate.equals(today);
	}
	
	public boolean isValidMedicine(Medicine medicine) throws MedicineException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidTname(medicine.getTname()))
			errMsgs.add("tname should start with a capital alphabet followed by 3 digits");
		
		if(!isValidDisease(medicine.getDisease()))
			errMsgs.add("disease must start with capital and must be in between 4 to 20 chars in length");
		
		if(!isValidPrice(medicine.getPrice()))
			errMsgs.add("Price must be between INR.5 and INR.5000");
		
		if(!isValidManufactureDate(medicine.getManufactureDate()))
			errMsgs.add("Publish Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new MedicineException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Medicine medicine) throws MedicineException {
		String tname=null;
		if(medicine!=null && isValidMedicine(medicine)){
			tname=medicineDao.add(medicine);
		}
		return tname;
	}

	@Override
	public boolean delete(String tname) throws MedicineException {
		boolean isDone=false;
		if(tname!=null && isValidTname(tname)){
			medicineDao.delete(tname);
			isDone = true;
		}else{
			throw new MedicineException("bcode should be a capital letter followed by 3 digits");
		}
		return isDone;
	}

	@Override
	public Medicine get(String tname) throws MedicineException {
		return medicineDao.get(tname);
	}

	@Override
	public List<Medicine> getAll() throws MedicineException {
		return medicineDao.getAll();
	}

	@Override
	public boolean update(Medicine medicine) throws MedicineException {
		boolean isDone = false;
		
		if(medicine!=null && isValidMedicine(medicine)){
			isDone = medicineDao.update(medicine);
		}
		
		return isDone;
	}


//	@Override
//	public void persist() throws BookStoreException {
//		bookDao.persist();
//	}
}