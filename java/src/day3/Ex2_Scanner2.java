package day3;

import java.util.Scanner;

public class Ex2_Scanner2 {

	public static void main(String[] args) {
//ctrl+shift+O 누르면 import 단축키		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble();
		System.out.println("입력한 실수는 "+num1+"입니다.");
		
		System.out.print("단어를 입력하세요 : ");
		//문자열은 next, next() : 앞뒤 공백을 제외한 단어를 읽어옴
		String str = scan.next();
		System.out.println("입력한 단어는"+str+"입니다.");
		
		//Scanner에는 문자를 가져오는 기능이 없음
		//next를 이용해서 문자열 가져오고 charAt 이용해서 (번지)번째 글자
		//charAt(번지)
		
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.println("입력한 문자는" +ch+ "입니다.");
		
		
		scan.close();

	}

}
