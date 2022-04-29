package day5;

import java.util.Scanner;

public class Ex1_reverseNumber {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 입력 받은 정수를 역으로 출력하는 코드를 작성하세요.반복문으로
		 * 
		 * 예 : 1230 -> 0321
		 * 123-> 3을 출력, 123 -> 12
		 * 12-> 2를 출력, 12 -> 1
		 * 1-> 1을 출력, 1 -> 0
		 * 
		 * 945 -> 5를 출력, 945 -> 94
		 * 94 -> 4를 출력, 94 -> 9
		 * 9 -> 9를 출력, 9 -> 0
		 * 
		 * 반복횟수 : num가 0이 아닐 때까지
		 * 규칙성 : num의 일의 자리를 출력 한 후 num를 10으로 나눈 몫을 num에 저장
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int reverseNum = 0;
		int tmpNum = num;
		while(num != 0) {
			//num-num/10*10;---정수/정수 해서 숫자 자르고 곱하기 해서 123에서 120만드는 거 가능
			System.out.println(num%10);
			//0 ->0*10+4=4 -> 4*10+3= 43 -> 432 -> 4321
			reverseNum = reverseNum + num %10;
			num = num/10;
		}
		System.out.println();
		System.out.println(tmpNum + "를 거꾸로한 정수 : " + reverseNum);
		
		
		scan.close();
		
		
	}

}
