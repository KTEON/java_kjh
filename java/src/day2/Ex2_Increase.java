package day2;

public class Ex2_Increase {

	public static void main(String[] args) {
		// 증감 연산자 : 최종적으로 1증가 또는 1 감소
		// 전위형 : ++변수명, 증가 후에 동작
		// 후위형 : 변수명 ++, 동자 후에 증가
		int num1 = 10, num2 = 10;
		//num1 :전위형, num2 : 후위형
		System.out.println(num1 + " , " + num2);
		System.out.println(++num1 + " , " + num2++);
		System.out.println(num1 + " , " + num2);
		
		int num3 = 10, num4 = 10;
		
		System.out.println(num3 + " , " + num4);
		++num3;
		System.out.println(num3 + " , " + num4);
		++num4;
		System.out.println(num3 + " , " + num4);
	}

}