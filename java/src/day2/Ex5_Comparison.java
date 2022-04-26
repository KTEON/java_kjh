package day2;

public class Ex5_Comparison {

	public static void main(String[] args) {
		/* >= 를 반대로 쓰면 안됨 =>(X)
		 * <= 를 반대로 쓰면 안됨 =<(X)
		 * ==를 =과 혼동하지 말자
		 * 비교 연산자는 연산자를 기준으로 양쪽에 어떤 수가 나옴
		 * 논리 연산자에서는 연산자 양쪽으로 참 또는 거짓
		 * 일반적으로 논리 연산자 양쪽으로 조건식이 나옴
		 * 
		 * 조건식 : 결과가 참 또는 거짓으로 나오는 식
		 * 
		 * AND : &&, ~하고, ~이고, 둘 다 참이면 참, 하나라도 거짓이면 거짓
		 * OR : ||, ~하거나, ~이거나, 둘 다 거짓이면 거짓, 하나라도 참이면 참
		 * XOR : ^, 둘다 같으면 거짓, 다르면 참 (잘 쓰이진 않음)
		 * NOT : !, 참은 거짓, 거짓은 참
		 * 
		 * AND 예 : A학점은 성적이 90 이상이고 100 이하다
		 * 80이면 90 이상 거짓, 100이하 참 -> 결국 거짓
		 * 
		 * OR 예 : 토익 셤 보러 갈 때 주민들록증ㅇ이나 여권이거나 학생증이거나 운전면허증 있으면 응시가능
		 * */
		
		int score = 95;
		System.out.println(score > 95);
		System.out.println(score >= 95);
		System.out.println(score < 95);
		System.out.println(score <= 95);
		System.out.println(score == 95);
		System.out.println(score != 95);

	}

}
