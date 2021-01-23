package com.yoontrue.crud;

public class LectureClass {
	String lecture;
	String classroom;
	
	public LectureClass(String lecture, String classroom) {
		this.lecture = lecture;
		this.classroom = classroom;
	}
	
	public LectureClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("강의명 : %-20s강의실 : %-20s", lecture, classroom);
	}
}
