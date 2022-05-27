package com.chainsys.miniproject.entry;

import java.util.Scanner;

import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class StartupValidation {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addNewEmployee, 2=updateEmpDetails ,3=viewEmployeeDetails ,4=ViewAllEmployeeDetails, 5=deleteEmpdetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;

			case 2:
				EmployeeUi.updateEmpDetails();
				break;
			case 3:
				EmployeeUi.viewEmployeeDetails();
				break;
			case 4:
				EmployeeUi.ViewAllEmployeeDetails();
				break;
			case 5:
				EmployeeUi.deleteEmpdetails();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for addNewDoctorInformation");
		System.out.println("press 2 for updateDoctorDetails");
		System.out.println("press 3 for deleteDoctorDetails");
        System.out.println("press 4 for viewDoctorsDetailsById");
		System.out.println("press 5 for viewAllDoctorsDetails");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				DoctorUi.addNewDoctorInformation();
				break;
			case 2:
				DoctorUi.updateDoctorDetails();
				break;
			case 3:
				DoctorUi.deleteDoctorDetails();
				break;
			case 4:
				DoctorUi.viewDoctorsDetailsById();
				break;
			case 5:
				DoctorUi.viewAllDoctorsDetails();
				break;
			default:
				System.out.println("Enter the value between 1 to 5");
			}

		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for addNewAppointments");
		System.out.println("press 2 for viewAppointmentDetails");
		System.out.println("press 3 for allAppointmentDetails");
		System.out.println("press 4 for updateAppDetails");
		System.out.println("press 5 for deleteAppointmentDetails");
		System.out.println("press 6 for updatePatientName");
		System.out.println("press 7 for updateCollectedfees");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AppointmentsUI.addNewAppointments();
				break;
			case 2:
				AppointmentsUI.viewAppointmentDetails();
				break;
			case 3:
				AppointmentsUI.allAppointmentDetails();
				break;
			case 4:
				AppointmentsUI.updateAppDetails();
				break;
			case 5:
				AppointmentsUI.deleteAppointmentDetails();
				break;
			case 6:
				AppointmentsUI.updatePatientName();
				break;
			case 7:
				AppointmentsUI.updateCollectedfees();
				break;
			default:
				System.out.println("enter the number 7 and below");
			}
		} finally {
			sc.close();
		}
	}

}