package day5;

import java.util.Scanner;

public class Ex4_DoWhile_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메뉴 출력 예제를 do while문으로 작성
		 */
		int menu;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("메뉴");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보수정");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			
		}while(menu != 5);// do while문에서는 세미콜론 넣줘야함
		scan.close();
		
		
		
	}

}
