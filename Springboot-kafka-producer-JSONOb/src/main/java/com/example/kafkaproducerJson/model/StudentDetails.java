package com.example.kafkaproducerJson.model;

public class StudentDetails {

	private String studentName;
	private String studentId;
	private String studentAge;
	private String studentAddress;

	public StudentDetails(String studentName, String studentId, String studentAge, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
