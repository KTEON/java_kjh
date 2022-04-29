package day5;


public class Ex9_MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * 구구단 7단을 출력하는 코드를 작성하세요.
		 * 7*1=7		7*?=??
		 * 7*2=14
		 * 7*3=21
		 * ...
		 * 7*9=63
		 */
		
		int num = 7;
		for(int i = 1;i<=9;i++) {
			//System.out.println(num + "X" + i + "=" + num *i);---------여기까지만 하고 num= 7넣어주고 밑에 지워주고 돌리면 7단 구구단
			
		}
		/*
		 * 구구단 2단 ~9단까지 출력하는 코드를 작성하세요
		 */
		
		for(num=2;num<=9;num++) {
			for(int i = 1;i<=9;i++) {
				System.out.println(num + "X" + i + "=" + num *i);
				
			}
		}
	}
}
