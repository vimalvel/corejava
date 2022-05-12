package com.chainsys.classandmethod;

public class Hospital {
	private  String Hospitalname;
	private String PatientName ;
	private int Ward ;
	private String Disease;
	public String getHospitalname() {
		return Hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		Hospitalname = hospitalname;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public int getWard() {
		return Ward;
	}
	public void setWard(int ward) {
		Ward = ward;
	}
	public String getDisease() {
		return Disease;
	}
	public void setDisease(String disease) {
		Disease = disease;
	}

}
