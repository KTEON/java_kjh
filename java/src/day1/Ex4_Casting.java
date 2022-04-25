package day1;

public class Ex4_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 타입변환
			// 작은 타입의 값은 큰 타입에 저장하는 경우
		// 강제 타입변환 : 값이나 변수 앞에 (타입명) 을 써줌
			// 큰 타입의 값을 작은 타입에 저장하는 경우(자동 타입 변환이 불가능한 경우)
			// 계산을 위해 특정값을 일시적으로 변환하는 경우( '/' 연산자 설명할 때 다시 언급- day2)
		
		//자동 타입변화 예(작은 타입의 값을 큰 타입에 저장)
		byte num1_1 = 1;
		int num1_2 = num1_1;
		double num1_3 = num1_2;
		
		// 강제 타입변환 예
		int num2_1 = 1;
		byte num2_2 = (byte)num2_1;
		num2_1 = (int)1.23;
		
		
		// 강제 타입변환 예 : 계산을 위해 특정값을 일시적으로 변화하는 경우
		double num3_1 = 1/2; // 1/2는 0.5가 아니라 0
		double num3_2 = (double)1/2; // 1.0/2는 0.5
		System.out.println(num3_1);
		System.out.println(num3_2);
		
		// 자동 타입변환 예 : 연산과정
		int num4_1 = 1;
		double num4_2 = 1.23;
		// num4_1과 더하는 값이 실수이기 때문에 num4_1을 실수로 자동 타입변환을 한 후 실수 + 실수를 계산하여 num4_3에 저장
		// 더할 때 자동 타입변화를 함
		double num4_3 = num4_1 + num4_2;
		// num4_1과 더하는 값이 정수이기 때문에 정수 + 정수를 한 후 더한 값을 실수로 자동 타입변환을 하여 num4_3에 저장
		// 더한 후에 저장하기 전에 타입변환을 함
		double num4_4 = num4_1 + 5;
		System.out.println(num4_3);
		System.out.println(num4_4);
		
		//55~56p. 정수를 실수로 자동형변활 할 때 정밀도가 떨어질 수 있다. int -> float
		// 이럴 때는 int -> float으로 타입변환하기보단 double로 타입변환하여 활용한다.
		int num5_1 = 1234567890;
		float num5_2 = num5_1;//자동 타입변환
		int num5_3 = (int)num5_2;//강제 타입변환
		System.out.println(num5_1);
		System.out.println(num5_2);
		System.out.println(num5_3);
	}		

}
