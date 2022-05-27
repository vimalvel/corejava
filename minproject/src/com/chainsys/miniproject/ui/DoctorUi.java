package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUi {

	public static void addNewDoctorInformation() {
		Scanner sc = new Scanner(System.in);
		Doctor newdoc = new Doctor();
		try {
			System.out.println("Enter Doctor ID : ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int doc_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoc.setDoc_id(doc_id);
			System.out.println("Enter Doctor Name : ");
			String Doc_name = sc.nextLine();
			try {
				Validator.checkStringOnly(Doc_name);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			newdoc.setDoc_name(Doc_name);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newdoc.setDob(newDate);
			System.out.println("Enter Doctor Speciality : ");
			String Speciality = sc.nextLine();
			try {
				Validator.checkStringOnly(Speciality);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			newdoc.setSpeciality(Speciality);
			System.out.println("Enter Doctor City : ");
			String City = sc.nextLine();
			try {
				Validator.checkStringOnly(City);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			newdoc.setDoc_city(City);
			System.out.println("Enter Doctor Phone number : ");
			String Phone_No = sc.nextLine();
			try {
				Validator.checkStringForParseInt(Phone_No);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			try {
				Validator.checkPhone(Phone_No);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Long Phone_no = Long.parseLong(Phone_No);
			try {
				Validator.CheckNumberForGreaterThanZero(Phone_no);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoc.setPhone(Phone_no);
			System.out.println("Enter Doctor Standard fees : ");
			String Fee = sc.nextLine();
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoc.setStandard_fees(Fees);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println("Record added : " + result);
			sc.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void updateDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		try {
			Doctor olddoc = new Doctor();
			try {
				System.out.println("Enter Doctor ID : ");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				int doc_id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(doc_id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				olddoc.setDoc_id(doc_id);
				// Doctor olddoc = DoctorDao.getDoctorById(id);
				System.out.println("Enter Doctor Name : ");
				String Doc_name = sc.nextLine();
				try {
					Validator.checkStringOnly(Doc_name);
				} catch (InvalidInputDataException e) {
					System.out.println("Error :" + e.getMessage());
				}
				olddoc.setDoc_name(Doc_name);
				Calendar c1 = Calendar.getInstance();
				java.util.Date newDate = c1.getTime();
				olddoc.setDob(newDate);
				System.out.println("Enter Doctor Speciality : ");
				String Speciality = sc.nextLine();
				try {
					Validator.checkStringOnly(Speciality);
				} catch (InvalidInputDataException e) {
					System.out.println("Error :" + e.getMessage());
				}
				olddoc.setSpeciality(Speciality);
				System.out.println("Enter Doctor City : ");
				String City = sc.nextLine();
				try {
					Validator.checkStringOnly(City);
				} catch (InvalidInputDataException e) {
					System.out.println("Error :" + e.getMessage());
				}
				olddoc.setDoc_city(City);
				System.out.println("Enter Doctor Phone number : ");
				String Phone_No = sc.nextLine();
				try {
					Validator.checkStringForParseInt(Phone_No);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Long Phone_no = Long.parseLong(Phone_No);
				try {
					Validator.CheckNumberForGreaterThanZero(Phone_no);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				olddoc.setPhone(Phone_no);
				System.out.println("Enter Doctor Standard fees : ");
				String Fee = sc.nextLine();
				try {
					Validator.checkStringForParseInt(Fee);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				float Fees = Float.parseFloat(Fee);
				try {
					Validator.CheckNumberForGreaterThanZero(Fees);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				olddoc.setStandard_fees(Fees);
				int result = DoctorDao.updateDoctor(olddoc);
				System.out.println("Record Updated : " + result);
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			sc.close();
		}
	}

	public static void deleteDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			try {
				System.out.println("Enter Doctor ID : ");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				int doc_id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(doc_id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoc.setDoc_id(doc_id);
				int result = DoctorDao.deleteDoctor(doc_id);
				System.out.println("Records Deleted :" + result);
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			sc.close();
		}
	}

	public static void viewDoctorsDetailsById() {

		Scanner sc = new Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			try {
				System.out.println("Enter Doctor ID : ");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				int doc_id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(doc_id);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				newdoc.setDoc_id(doc_id);
				Doctor doc = DoctorDao.getDoctorById(doc_id);
				System.out.println("Doctor ID : " + doc.getDoc_id() + "\n" + "Doctor Name : " + doc.getDoc_name() + "\n"
						+ "Doctor Speciality : " + doc.getSpeciality() + "\n" + "Doctor City : " + doc.getDoc_city()
						+ "\n" + "Doctor Number : " + doc.getPhone() + "\n" + "Doctor Fees : "
						+ doc.getStandard_fees());

			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			sc.close();
		}
	}

	public static void viewAllDoctorsDetails() {
		try {
			List<Doctor> allDoctor = DoctorDao.getAllDoctors();
			Iterator<Doctor> docIterator = allDoctor.iterator();
			while (docIterator.hasNext()) {
				Doctor doc = docIterator.next();
				System.out.println("Doctor ID : " + doc.getDoc_id() + "\n" + "Doctor Name : " + doc.getDoc_name() + "\n"
						+ "Doctor Speciality : " + doc.getSpeciality() + "\n" + "Doctor City : " + doc.getDoc_city()
						+ "\n" + "Doctor Number : " + doc.getPhone() + "\n" + "Doctor Fees : "
						+ doc.getStandard_fees());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}