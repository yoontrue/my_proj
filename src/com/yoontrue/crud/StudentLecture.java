package com.yoontrue.crud;

public class StudentLecture {
	String name;
	String phone;
	String major;
	String lecture;
	
	public StudentLecture(String name, String phone, String major, String lecture) {
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.lecture = lecture;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public StudentLecture() {		// 생성자.
		// TODO Auto-generated constructor stub
	}
	
	public StudentLecture(StudentLecture mkStd) {			// 지워? 말아?
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %-10s전화 : %-20s전공 : %-20s강의 : %-20s", name, phone, major, lecture);
	}
}
