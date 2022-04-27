package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		/*한 학생의 수학, 영어, 국어, 성적을 입력받고, 총점과 평균을 구하세요.
		 * 단, 성적은 정수로 입력받고 0~100사이의 정수를 입력해야 합니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요 : ");
		int num1 = scan.nextInt();		
		System.out.println("입력한 국어 성적은 "+num1+"입니다.");
		
		System.out.print("영어 성적을 입력하세요 : ");
		int num2 = scan.nextInt();		
		System.out.println("입력한 영어 성적은 "+num2+"입니다.");
		
		System.out.print("수학 성적을 입력하세요 : ");
		int num3 = scan.nextInt();		
		System.out.println("입력한 수학 성적은 "+num3+"입니다.");
		
		System.out.println("입력한 성적의 총점은"+ (num1+num2+num3) +"입니다.");
		System.out.println("입력한 성적의 평균은 "+(num1+num2+num3)/3.0+"입니다.");		
		
		scan.close();
	}

}

/*
*/