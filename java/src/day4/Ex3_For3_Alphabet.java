package day4;

public class Ex3_For3_Alphabet {

	public static void main(String[] args) {
		/*반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요.
		 * 
		 * 
		 * 반복횟수 : 26번
		 * 			i는 0~26보다 작을 때 까지 1씩 증가
		 * 실행문 : (char)('a'+i)를 출력
		 * 반복문 종료 후 : 없음
		 */
		int i;
		
		//i는 0~26보다 작을 때 까지 1씩 증가
		for(i=0;i<26;i++) {
			
			//(char)('a'+i)를 출력
			
			System.out.print((char)('A'+i));
			
			
		/*반복횟수 : 26
		 * 		   j는 'a'부터 'z'까지 1씩 증가
		 * 
		 * 규칙성: j를 출력
		 * 반복문 종료 휴 : 없음
		 * 
		 */
		System.out.println();
		char j;
		
		//j는 'a'부터 'z'까지 1씩 증가
		for(j='a';j<='z';j++) {
			//j를 출력
			System.out.print(j);
		}
		int num1 = 1;
		char ch1 = 'a' +1;//리터럴상수 1은 char 타입이어서 타입 변환이 발생하지 않음
		char ch2 = (char)('a'+num1);
		}
	}

}
