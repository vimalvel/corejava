package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.dao.AppointmentDao;

public class TestAppointments {

	public static void testGetAllAppointments() {
		List<Appointments> allapp = AppointmentDao.getAllAppointment();
		Iterator<Appointments> appItr = allapp.iterator();
		while (appItr.hasNext()) {
			Appointments app = appItr.next();
			System.out.print("app_id:" + "\t" + app.getApp_id() + "\t" + "doc_date" + app.getApp_date() + "\t"
					+ "doc_id:" + app.getDoc_id());
			System.out.println("\t" + "Collected fees:" + app.getFees_collected());
		}

	}

	public static void testgetAppointmentById() {
		Appointments app = AppointmentDao.getAppointmentById(101);
		System.out.print("app_id:" + "\t" + app.getApp_id() + "\t" + "doc_date" + app.getApp_date() + "\t" + "doc_id:"
				+ app.getDoc_id());
		System.out.println("\t" + "Collected fees:" + app.getFees_collected());
	}

	public static void testInsertNewAppointments() {
		Appointments app = new Appointments();
		app.setApp_id(102);
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			app.setApp_date(appFormate.parse("30/01/2022"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		app.setDoc_id(3);
		app.setPatient_name("Boruto uzumaki");
		app.setFees_collected(50);
		app.setFees_catagery("low");
		int result = AppointmentDao.insertAppointment(app);
		System.out.println(result + "row inserted");
	}

	public static void testUpdateAppointments() {
		Appointments app = new Appointments();
		app.setApp_id(102);
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			app.setApp_date(appFormate.parse("03/02/2022"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		app.setDoc_id(3);
		app.setPatient_name("Boruto uzumaki");
		app.setFees_collected(10);
		app.setFees_catagery("low");
		int result = AppointmentDao.updateAppointment(app);
		System.out.println(result + " row updated");

	}

}