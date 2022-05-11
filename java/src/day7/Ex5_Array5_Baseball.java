package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {

	public static void main(String[] args) {
		/*
		 * 정수 3개짜리 배열 com을 생성 한 후 핸덤으로 세 정수를 만들어
		 * 배열에 저장하는 코드를 작성하세요(중복가능)
		 */
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 9;
		int com[] = new int[3];
		int user[]= new int[3];
		for(int i = 0; i<3; i++) {
			com[i] = (int)(Math.random()*(max-min+1)+min); //랜덤 써야할 때 공식처럼 쓰임 암기할 것
			System.out.print(com[i] + " ");
		}
		/*
		 * 사용자가 정수 3개를 입력하여 3S가 될 때까지 게임을 진행하도록 코드를 작성하세요.
		 * 단 사용자가 입력한 정수도 배열에 저장되도록.
		 */
		int s, b;
		do {
			s=0;
			b=0;
			for(int i=0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
		}while(s < 3);
		
	}
}
