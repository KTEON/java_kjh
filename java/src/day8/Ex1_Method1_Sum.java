package day8;

public class Ex1_Method1_Sum {

	public static void main(String[] args) {
		/*
		 * 두 정수의 합을 알려주는 메소드를 작성해보세요.
		 * 
		 */
		int num1 = 1, num2 = 2;
		int res = sum1(num1, num2);
		System.out.println(res);
		sum1(1,2);
	}
	/*
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 합 => 정수 => int
	 * 메소드명 : sum
	 */
	public static int sum1(int num1, int num2) {
		int res = num1+num2;
		return res;		
	}
	/*
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 없음 => void
	 * 메소드명 : sum2
	 */
	public static void sum2( int num1, int num2) {
		int res = num1+num2;
		System.out.println(res);
	}
}
