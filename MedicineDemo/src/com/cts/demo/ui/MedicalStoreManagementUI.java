package com.cts.demo.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cts.demo.exception.MedicineException;
import com.cts.demo.model.MedicalStoreAppMenu;
import com.cts.demo.model.Medicine;
import com.cts.demo.service.IMedicineService;
import com.cts.demo.service.MedicineServiceImpl;

public class MedicalStoreManagementUI {

	
		
		private static IMedicineService mService;
		private static Scanner scan;
		private static DateTimeFormatter dtFormater;

		public static void main(String[] args) {

			try {
				mService = new MedicineServiceImpl();
			} catch (MedicineException e) {
				e.printStackTrace();
			}


			scan = new Scanner(System.in);
			dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			MedicalStoreAppMenu menu = null;

			while (menu != MedicalStoreAppMenu.QUIT) {

				System.out.println("Choice\tMenu Item");
				System.out.println("===========================");
				for (MedicalStoreAppMenu m : MedicalStoreAppMenu.values()) {
					System.out.println(m.ordinal() + "\t" + m.name());
				}
				System.out.print("Choice: ");
				int choice = -1;
				if (scan.hasNextInt())
					choice = scan.nextInt();
				else {
					scan.next();
					System.out.println("Pleae choose a choice displayed");
					continue;
				}

				if (choice < 0 || choice >= MedicalStoreAppMenu.values().length) {
					System.out.println("Invalid Choice");
				} else {
					menu = MedicalStoreAppMenu.values()[choice];
					switch (menu) {
					case ADD:
						doAdd();
						break;
					case LIST:
						doList();
						break;
					case SEARCH:
						doSearch();
						break;
					case REMOVE:
						doRemove();
						break;
					case QUIT:
						System.out.println("ThanQ Come Again!");
						break;
					}
				}

			}

			scan.close();
//			try {
//				//bookService.persist();
//			} catch (BookStoreException e) {
//				e.printStackTrace();
//			}

		}

		private static void doAdd() {
			try {
				Medicine medicine = new Medicine();
				System.out.print("TName: ");
				medicine.setTname(scan.next());
				System.out.print("Disease: ");
				medicine.setDisease(scan.next());
				System.out.print("ManufactureDate(dd-MM-yyyy): ");
				String manDtStr = scan.next();

				try {
					medicine.setManufactureDate(LocalDate.parse(manDtStr, dtFormater));
				} catch (DateTimeException exp) {
					throw new MedicineException(
							"Date must be in the format day(dd)-month(MM)-year(yyyy)");
				}
				System.out.print("Price: ");
				if (scan.hasNextDouble())
					medicine.setPrice(scan.nextDouble());
				else {
					scan.next();
					throw new MedicineException("Price is a number");
				}

				String tname = mService.add(medicine);
				System.out.println("Medicine is Added with name: " + tname);
			} catch (MedicineException exp) {
				System.out.println(exp.getMessage());
			}
		}

		private static void doList() {
			List<Medicine> medicines;
			try {
				medicines = mService.getAll();
				if (medicines.size() == 0) {
					System.out.println("No Medicines To display");
				} else {
					for (Medicine b : medicines)
						System.out.println(b);
				}
			} catch (MedicineException exp) {
				System.out.println(exp.getMessage());
			}
		}

		private static void doSearch() {
			System.out.print("TName: ");
			String tname = scan.next();

			try {
				Medicine medicine = mService.get(tname);
				if (medicine != null) {
					System.out.println(medicine);
				} else {
					System.out.println("No Such medicine");
				}
			} catch (MedicineException exp) {
				System.out.println(exp.getMessage());
			}
		}

		private static void doRemove() {
			System.out.print("TName: ");
			String tname = scan.next();
			try {
				boolean isDone = mService.delete(tname);
				if (isDone) {
					System.out.println("medicine is Deleted");
				} else {
					System.out.println("No Such Medicine");
				}
			} catch (MedicineException exp) {
				System.out.println(exp.getMessage());
			}
		
	

		

	}

}
