package day3;

import java.util.Scanner;

public class Ex3_Sccanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 출력하는 코드를 작성
		 * 산술연산자는 문자로 받아주세요.
		 * 
		 */
		/* 스캐너 해서 콘솔
		 * 
		 * "정수를 입력하세요." "입력한 정수는 : "
		 * "산술연산자를 입력하세요." "입력한 산술연산자는 : "
		 * */
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 "+num1+"입니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("입력한 정수는 "+num2+"입니다.");
				 
		System.out.print("산술연산자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.println("입력한 산술연산자는" +ch+ "입니다.");
		System.out.println("입력한 산술연산자와 정수들은" +ch+','+ num1+','+ num2+ "입니다.");
	}

}

/*강사님의 경우 
 * 정수1을 입력하세요 : 1
 * 정수2를 입력하세요 : 2
 * 산술연산자를 입력하세요 : +
 * 1+2
 * 
 * 방법2.
 * 두 정수와 산술연산자를 입력하세요(예 : 1+2) : 1+2
 * 1+2
 * 
 * System.out.print("정수1을 입력하세요 : ");
 * int num1 = scan.nextInt();
 * 
 * System.out.print("정수2을 입력하세요 : ");
 * int num2 = scan.nextInt();
 * 
 * System.out.print("산술연산자를 입력하세요 : ");
 * char op = scan.next().charAt(0);
 * 문자열 + 정수 -> 문자열
 * sysoutln(num1+op+num2);(X)
 * sysoutln(""+num1+op+num2);(O)
 * 
 * 
 * 
 * 방법2
 * 
 * System.out.print("정수와 산술연산자를 입력하세요 : ");
 * int num3 = scan.nextInt();
 * char
 * int num3 = scan.nextInt();
 */
