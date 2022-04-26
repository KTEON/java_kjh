package day2;

public class Ex16_Test4 {

	public static void main(String[] args) {
		/*num1과 num2이 주어지고 산술연산자 op가 주어졌을 때 산술연산자에 맞는 결과가 출력되는 코드를 작성하세요.
		 * 
		 */
		
		int num1 = 1;
		int num2 = 2;
		char op = '/';
		
		if(op == '/') {
			System.out.println(num1 + "/" + num2 + "=" + (num1/(double)num2));
		}
		else if(op == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
	}
		else if(op == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
		else if(op == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
	}
		else if(op == '%') {
			System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
	}
		else {
			System.out.println("잘못된 연산자 입니다.");
		}

}
}

/*강사님의 경우
 * 
 * 
 * 	if(op == '+'){
 * 		sysout(""+num1 + op + num2 + "=" +3);
 * }
 * 이렇게 되면 1+2=3 이렇게 나옴
 * 
 * 
 */
