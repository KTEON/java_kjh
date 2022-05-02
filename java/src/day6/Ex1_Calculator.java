package day6;

import java.util.Scanner;

public class Ex1_Calculator {

	public static void main(String[] args) {
		/*
		 * 문자를 입력받아 입력받은 문자를 출력하는 코드를 작성하세요.
		 * 단, q가 입력될 때 까지 입력을 계속적으로 받습니다.
		 * 메뉴를 선택하면 정수 2개를 입력받아 입력받은 값에 맞는 산술 연산 결과를 출력하는 코드를 작성.
		 * 
		 * 산술연산자메뉴
		 * 1.더하기
		 * 2.빼기
		 * 3.곱하기
		 * 4.나누기
		 * 5.나머지
		 * q.종료
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		for(;;) {
			System.out.println("산술 연산자 메뉴");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5.나머지");
			System.out.println("q. 종료");		
			System.out.print("원하는 메뉴를 입력하세요 : ");
			
			char ch = scan.next().charAt(0);
			if(ch == 'q') {
				System.out.println("입력하신 메뉴는 " + ch + " 종료입니다.");
				break;//브레이크 돼 버려서 밑에서 변수 선언 해야함
			} 
			if(ch < '1'|| ch>'5') {
				System.out.println("잘못된 연산자입니다.");
				continue;
			}
			System.out.println("두 정수를 입력하세요(예 1 2) : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			double res = 0.0;
			switch(ch) {
			case '1' : 
				res = num1 + num2; 
				System.out.println(""+ num1 + '+' + num2 + "=" + res);
				break;
			case '2' : 
				res = num1 - num2; 
				System.out.println(""+ num1 + '-' + num2 + "=" +res);
				break;
			case '3' : 
				res = num1 * num2; 
				System.out.println(""+ num1 + '*' + num2 + "=" + res);
				break;
			case '4' : 
				res = num1 / num2; 
				System.out.println(""+ num1 + '/' + num2 + "=" + res);
				break;
			case '5' : 
				res = num1 % num2; 
				System.out.println(""+ num1 + '%' + num2 + "=" + res);
				break;
		
			}
		}
		
		/* 방법 1
		char ch = 'a';
		for(;ch != 'q';) {
		System.out.print("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		System.out.println(ch);
		}
		*/
		/* 방법 2 
		char ch;
		do {
		System.out.print("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		System.out.println(ch);
		}while(ch != 'q');
		*/
		
	}

}
