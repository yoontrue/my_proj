package com.yoontrue.crud;
import java.util.Scanner;

public class ManageSL {
	static Scanner scan = new Scanner(System.in);
//	static ArrayList<StudentLecture> student = new ArrayList<StudentLecture>();
	static int menuNum;
	static int no;
	
	static int menu() {
		System.out.println("[1. 입력]   [2. 전체조회]   [3. 검색]   [4. 수정]   [5. 삭제]   [6. 종료]");
		System.out.print("Choice>>> ");
		try {
			no = scan.nextInt();
		}catch (Exception e) {
			System.out.println("정수만 입력 가능합니다!");
			scan.nextLine();
			menu();		// 재귀호출(자기 자신을 다시 호출)
		}
		return no;
	}
	
	public static void main(String[] args) {
		while(true) {
			int no = menu();
			switch(no) {
			case 1 : MenuCall.input(); break;
			case 2 : MenuCall.output(); break;
			case 3 : MenuCall.search(); break;
			case 4 : MenuCall.modify(); break;
			case 5 : MenuCall.delete(); break;
			case 6 : MenuCall.end(); break;
			default : System.out.println("경고 : 해당사항 없습니다!");
			}
			System.out.println("----------------------------------");
			System.out.println();
		}
	}
}
