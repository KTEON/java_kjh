package day3;

public class Ex10_For1 {

	public static void main(String[] args) {
		/*콘솔에 Hello를 5번 출력하세요.
		 * 
		 * 
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 초기화 : i는 1부터
		 * 조건식 : i는 5까지(초기값에 따라 '까지'가 의미가 달라진다)
		 * 증감식 : i는 1씩 증가
		 * 규칙석(실행문) : Hello를 출력
		 * 
		 * */
		int i;
		for(i=1; i<=5; i++) {// 번거로우니까 괄호안을 (i=0; i<5; i++)도 가능
			System.out.println("Hello");
		}
		System.out.println(i);// 6이 되면서 거짓이 돼서 멈춤 그래서 i=6이 나옴
	}

}
