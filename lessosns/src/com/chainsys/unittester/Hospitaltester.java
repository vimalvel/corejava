package com.chainsys.unittester;
import com.chainsys.classandmethod.Hospital;

public class Hospitaltester {
	public static void testhospital()
	{
		Hospital obj = new Hospital();
		obj.setHospitalname("NAVAMANI");
		obj.setPatientName("DIWIN");
		obj.setWard(20);
		obj.setDisease("covid19");
		System.out.println(obj.getHospitalname());
		System.out.println(obj.getPatientName());
		System.out.println(obj.getWard());
		System.out.println(obj.getDisease());
	}

}
