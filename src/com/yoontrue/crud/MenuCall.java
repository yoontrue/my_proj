package com.yoontrue.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCall {
	static ArrayList<StudentLecture> student = new ArrayList<StudentLecture>();
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	static String searchName;
	static int searchIdx;
	static StudentLecture std = new StudentLecture();
	static int numOfStudent;
	static String name;
	static String phone;
	static String major;
	static String lecture;
	
	static StudentLecture mkStd() {
		std = new StudentLecture();		// 이거 안하면... 항상 맨 마지막 객체로 이전 객체들한테 덮어씌어짐 ㅠㅠㅜㅜㅜㅠ
		System.out.println();
		System.out.println(": : :    정보   입력    : : :");
		System.out.print("이름 : ");
		std.name = scan.nextLine();
		System.out.print("전화 : ");
		std.phone = scan.nextLine();
		System.out.print("전공 : ");
		std.major = scan.nextLine();
		System.out.print("강의 : ");
		std.lecture = scan.nextLine();
		return std;
	}
	
	public static void input(){
		student.add(mkStd());
		System.out.println("==== " + student.size() + "번 입력 ====");
	}
	
	public static void output(){
		System.out.println();
		System.out.println(": : :   학생 리스트   : : :");
		for(StudentLecture i : student) {
			System.out.println(i);
		}
	}
	
	public static void search(){
		int count = 0;
		System.out.println();
		System.out.println(": : :   학 생   검 색   : : :");
		System.out.print("학 생 이 름 입 력 : ");
		searchName = scan.nextLine();
		for(StudentLecture s : student) {
			if(s.getName().equals(searchName)) {
				System.out.println(s);
				count++;
			}
		}
		System.out.println("검색결과 총 " + count + "명");
	}
	
	public static void modify(){
		ArrayList<StudentLecture> modiList = new ArrayList<StudentLecture>();
		int idx = 0;
		String na,ph,mj,lec;
		System.out.println();
		System.out.println(": : :   정 보   변 경   : : :");
		System.out.print("찾을 이름을 입력해주세요 : ");
		System.out.println();
		System.out.print("찾을 사람 : ");
		searchName = scan.nextLine();
		
		for(StudentLecture s : student) {
			if(s.getName().equals(searchName)) {
				idx++;
				modiList.add(s);		// 검색결과  리스트에 저장
				System.out.println("[" + idx + "번]\t" + s);
			}	// end of comparison
		} // end of for
		// 동명이인 modiList에 저장함.
		System.out.println("[ 검색결과  총 " + idx + " 건 ]");
		System.out.print("변경 원하는 학생 번호 입력 : ");
		idx = scan2.nextInt();		// idx-1할것!
		
		na = modiList.get(idx-1).name;
		ph = modiList.get(idx-1).phone;
		mj = modiList.get(idx-1).major;
		lec = modiList.get(idx-1).lecture;
		
		int modiIdx = student.indexOf(modiList.get(idx-1));		// 변경 원하는 객체에 대한 인덱스값 저장.나중에 어레이리스트에서 변경해줄거!
		System.out.println(">>  " + modiList.get(idx-1));
		System.out.println("변경을 원하는 메뉴번호를 입력하세요.");
		System.out.println("[1. 이름][2. 전화][3. 전공][4. 강의]");
		int changeMenu = scan2.nextInt();
		switch(changeMenu) {
		case 1 :
			System.out.print("이름 변경 : ");
			na = scan.nextLine();
			break;
		case 2 :
			System.out.print("전화 변경 : ");
			ph = scan.nextLine();
			break;
		case 3 :
			System.out.print("전공 변경 : ");
			mj = scan.nextLine();
			break;
		case 4 :
			System.out.print("강의 변경 : ");
			lec = scan.nextLine();
			break;
		default :
			break;
		}
		student.set(modiIdx, new StudentLecture(na,ph,mj,lec));
	}
	
	public static void delete(){
		ArrayList<StudentLecture> delList = new ArrayList<StudentLecture>();
		int idx = 0;
		System.out.println();
		System.out.print("지울 사람 : ");
		searchName = scan.nextLine();
		
		for(StudentLecture s : student) {
			if(s.getName().equals(searchName)) {
				idx++;
				delList.add(s);		// 검색결과  리스트에 저장
				System.out.println("[" + idx + "번]\t" + s);
			}	// end of comparison
		} // end of for
		System.out.println("[ 검색결과  총 " + idx + " 건 ]");
		System.out.print("삭제 원하는 학생 번호 입력 : ");
		idx = scan2.nextInt();
		student.remove(delList.get(idx-1));		// idx로 delList에서 객체를 뽑아와서 해당객체를 student에서 삭제...
		System.out.println(": : :   삭제되었습니다   : : :");		
	}
	
	public static void end(){
		System.out.println();
		System.out.println(": : :   프로그램종료   : : :");
		System.out.println(": : :   감 사 합 니 다   : : :");
		System.exit(0);	// 강제종료!
	}
}
